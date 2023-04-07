package programmers.exam.e3;

import java.util.Arrays;

public class E12 {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int defaultIndex = arr.length - arr.length / 2;
        int defaultScore = arr[defaultIndex];
        int answer = 0;
        for (int i = defaultIndex - 1; i >= 0; i--) {

            if (arr[i] != defaultScore) {
                break;
            }
            answer++;
        }
        return answer + arr.length / 2;
    }

    public static void main(String[] args) {
        E12 e12 = new E12();
        int solution = e12.solution(new int[]{100, 95, 95, 95, 90});
        int solution2 = e12.solution(new int[]{0, 0, 0, 0, 0});
        int solution3 = e12.solution(new int[]{100, 95, 90, 90, 90, 90, 0});
        int solution4 = e12.solution(new int[]{100, 95, 91, 90, 90, 90});
        int solution5 = e12.solution(new int[]{100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println(solution);
        System.out.println(solution2);
        System.out.println(solution3);
        System.out.println(solution4);
        System.out.println(solution5);
    }
}
