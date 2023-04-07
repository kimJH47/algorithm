package dp;

import java.util.Arrays;

public class MakeOne {
    public int solution(int n) {
        if (n == 1 || n == 2 || n == 3 || n == 5) {
            return 1;
        }
        if (n == 4) {
            return 2;
        }
        int[] dp = new int[n + 1];




        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }

            if (i % 5 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 5] + 1);
            }

        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        MakeOne makeOne = new MakeOne();
        int solution = makeOne.solution(26);
        System.out.println(solution);
    }
}
