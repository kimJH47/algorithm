package programmers.exam.e2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class E42 {
    public int solution(int[] A, int K) {
        List<Integer> list = Arrays.stream(A)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        int count = 0;
        int result = 0;
        int a = 0;
        int b = 0;
        while (count < K - 1) {

            count++;
            b++;
            if (a == b) {
                count--;
                continue;
            }
            if (b % list.size() == 0) {
                a++;
                b = 0;
            }
            result = list.get(a) * 10 + list.get(b);


        }
        return list.get(a) * 10 + list.get(b);
    }

    public static void main(String[] args) {
        E42 e42 = new E42();
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 1; i < 50; i++) {
            System.out.println(e42.solution(a, i + 1));

        }
    }
}
