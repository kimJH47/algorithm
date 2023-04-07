package programmers.exam.e3;

import java.util.Arrays;

public class E25 {
    public int solution(int[] arr, int n) {
        Arrays.sort(arr);
        if (arr.length == 0 || arr[0] > n) {
            return -1;
        }
        int answer = -1;
        for (int num : arr) {
            if (n < num) {
                return answer;
            }
            answer = num;
        }
        return answer;
    }

    public static void main(String[] args) {
        E25 e25 = new E25();
        int solution = e25.solution(new int[]{}, 5);
        System.out.println(solution);
    }
}
