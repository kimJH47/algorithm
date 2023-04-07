package programmers.exam.e3;

import java.util.Arrays;

public class E31 {
    public int solution(int[] arr, int n) {
        Arrays.sort(arr);
        if (arr.length == 0) {
            return -1;
        }
        for (int num : arr) {
            if (num >= n) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        E31 e31 = new E31();
        int solution1 = e31.solution(new int[]{1, 2, 3, 4, 5, 6}, 7);
        int solution2 = e31.solution(new int[]{1, 2, 3, 4, 5, 7}, 7);
        System.out.println(solution1);
        System.out.println(solution2);
    }
}
