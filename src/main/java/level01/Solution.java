package level01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 50, 1, 1, 1, 1};
        int[] int2 = new int[]{100, 50, 1, 1, 1, 1};
        solution(ints, int2);
        System.out.println(99 / 100);
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> qe = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            qe.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));



        }

        ArrayList<Integer> answer = new ArrayList<>();
        int time = qe.poll();
        int completed = 1;

        while (!qe.isEmpty()) {
            if (time >= qe.peek()) {
                completed++;
                qe.poll();
                continue;
            }
            time = qe.poll();
            answer.add(completed);
            completed = 1;
        }
        return answer.stream()
                .mapToInt(value -> value)
                .toArray();
    }
}
