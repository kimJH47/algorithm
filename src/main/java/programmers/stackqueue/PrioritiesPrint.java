package programmers.stackqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrioritiesPrint {
    public int solution(int[] priorities, int location) {

        Queue<Integer> qe = new LinkedList<>();
        for (int priority : priorities) {
            qe.add(priority);
        }

        int count = 0;
        Arrays.sort(priorities);
        int index = priorities.length - 1;

        while (!qe.isEmpty()) {
            Integer num = qe.poll();
            if (num >= priorities[index]) {
                index--;
                count++;
                if (location == 0) {
                    return count;
                }
                location--;
                continue;
            }
            qe.offer(num);
            if (location == 0) {
                location = qe.size();
            }
            location--;
        }

        return count;
    }

    public static void main(String[] args) {
        PrioritiesPrint prioritiesPrint = new PrioritiesPrint();
        prioritiesPrint.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
    }
}
