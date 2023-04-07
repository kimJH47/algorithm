package programmers.exam.e3;

import java.util.ArrayDeque;
import java.util.Arrays;

public class E33 {
    public int solution(int[] A) {
        Arrays.sort(A);
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (Integer num : A) {
            dq.add(num);
        }
        int index = A.length;
        int result = 0;
        while (!dq.isEmpty()) {
            if (index % 2 == 0) {
                result += dq.removeFirst() * -index;
                index--;
                continue;
            }
            result += dq.removeLast() * index;
            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        E33 e33 = new E33();
        int solution = e33.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(solution);
    }
}
