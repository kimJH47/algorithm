package beakjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class E11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>[] graphs = new ArrayList[Integer.parseInt(read.readLine()) + 1];
        int[] parents = new int[graphs.length];

        for (int i = 1; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>();
        }
        for (int i = 0; i < graphs.length - 2; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(read.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            graphs[a].add(b);
            graphs[b].add(a);
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            List<Integer> graph = graphs[poll];
            for (Integer index : graph) {
                if (parents[index] != 0) {
                    continue;
                }
                parents[index] = poll;
                queue.add(index);
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i < parents.length; i++) {
            stringBuilder.append(parents[i])
                    .append("\n");
        }
        System.out.println(stringBuilder);
    }
}
