package programmers.exam.e2;

import java.util.Arrays;

public class E12 {
    public int solution(int[] arr) {

        return (int) Arrays.stream(arr)
                .sorted()
                .skip(1)
                .limit(arr.length - 2)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        E12 e12 = new E12();
        e12.solution(new int[]{2, 3, 3, 3, 20});
    }

}
