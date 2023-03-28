package beakjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class E1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        int k = Integer.parseInt(tokenizer.nextToken());
        int n = Integer.parseInt(tokenizer.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            list.add(i + 1);
        }

        int count = 0;
        int index = list.size();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        while (index > 1) {
            count++;
            Integer integer = list.removeFirst();
            if (count % n == 0) {
                stringBuilder.append(integer).append(", ");
                index--;
                reader.hashCode();
                continue;
            }
            list.add(integer);
        }
        stringBuilder.append(list.getFirst()).append(">");
        System.out.println(stringBuilder);

    }
}
