package programmers.exam.e2;

import java.util.ArrayDeque;
import java.util.Queue;

public class E22 {
    public int[] solution(int[] arr) {
        Queue<Integer> q = new ArrayDeque<>();
        for (Integer integer : arr) {
            if (integer % 2 != 0) {
                q.add(integer);
            }
            q.add(integer);
        }

        return q.stream()
                .limit(arr.length)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        E22 e22 = new E22();
        e22.solution(new int[]{0, 2, 1, 4, 3, 0});

    }
}
