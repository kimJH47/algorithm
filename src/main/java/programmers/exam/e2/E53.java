package programmers.exam.e2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class E53 {
    public int solution(int[] cards) {
        PriorityQueue<Integer> dq = Arrays.stream(cards)
                .boxed()
                .collect(Collectors.toCollection(() ->
                        new PriorityQueue<>(Collections.reverseOrder())));

        while (!dq.isEmpty() && dq.size() > 1) {
            Integer x = dq.remove();
            Integer y = dq.remove();
            if (x - y != 0) {
                dq.add(Math.abs(x - y));
            }
        }
        if (dq.isEmpty()) {
            return 0;
        }
        return dq.remove();
    }

    public static void main(String[] args) {
        E53 e53 = new E53();
        int solution = e53.solution(new int[]{4, 8, 6, 1, 2});
        System.out.println(solution);

    }
}
