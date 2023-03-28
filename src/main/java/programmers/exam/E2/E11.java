package programmers.exam.E2;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.stream.Collectors;

public class E11 {
    public int solution(int[] arr) {
        int[] numbers = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        for (int i = 0; i < numbers.length - 2; i++) {
            int c = numbers[i];
            int a = numbers[i + 1];
            int b = numbers[i + 2];
            if (a + b  > c) {
                return a + b + c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        E11 e11 = new E11();
        e11.solution(new int[]{5, 19, 4, 23, 198, 34});
    }

}
