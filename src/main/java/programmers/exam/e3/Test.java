package programmers.exam.e3;

public class Test {
    public int solution(int n) {
        if (n == 1) {
            return 10;
        }
        if (n == 2) {
            return 9;
        }

        long result = 1;
        long even = 9;
        long odd = 10;
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) {
                result = (10 * even) % 1_000_000_007;
                even = result;

            } else {
                result = (9 * odd) % 1_000_000_007;
                odd = result;
            }
        }
        //% 1_000_000_007
        return (int) result;
    }

    public static void main(String[] args) {
        Test test = new Test();
        for (int i = 1; i < 10000; i++) {
            int solution = test.solution(i);
            System.out.println(solution);
        }

    }
}

//
//class Solution {
//    public int solution(int n) {
//        if (n == 1) {
//            return 10;
//        }
//        if (n == 2) {
//            return 9;
//        }
//
//        long[] dp = new long[n + 1];
//
//        dp[1] = 10;
//        dp[2] = 9;
//
//        for (int i = 3; i <= n; i++) {
//            if (i % 2 == 0) {
//                dp[i] = (10 * dp[i - 2]) % 1_000_000_007;
//                continue;
//
//            }
//            dp[i] = (9 * dp[i - 2]) % 1_000_000_007;;
//        }
//        return (int)(dp[n] % 1_000_000_007);
//    }
//}