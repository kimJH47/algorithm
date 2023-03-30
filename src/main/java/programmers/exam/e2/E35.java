package programmers.exam.e2;

import java.util.ArrayDeque;
import java.util.Deque;

public class E35 {
    public int solution(int N, int K) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }
        int count = 0;
        while (dq.size() > 1) {
            count++;
            Integer people = dq.remove();
            if (count % K != 0) {
                dq.add(people);
            }
        }
        return dq.remove();
    }

    public static void main(String[] args) {
        E35 e35 = new E35();
        e35.solution(7, 3);
    }
}
