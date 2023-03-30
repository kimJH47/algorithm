package programmers.exam.e2;

import java.util.Arrays;
import java.util.stream.IntStream;


public class E52 {
    public int solution(int[] nums, int n) {
        return countWithNegativeOne(Arrays.stream(nums)
                .takeWhile(value -> value != n), nums.length);
    }

    private int countWithNegativeOne(IntStream stream, int length) {
        long count = stream.count();
        return count == length ? -1 : (int) count;
    }

    public static void main(String[] args) {
        E52 e52 = new E52();
        int solution = e52.solution(new int[]{2, 5, 8, 0}, 2);
        System.out.println(solution);
    }
}
