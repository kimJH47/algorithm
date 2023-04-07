package dp;

public class MonetaryComposition {
    public int solution(int[] N, int M) {
        int[] dp = new int[M + 1];
        int INF = 10001;

        for (int i = 1; i < dp.length; i++) {
            dp[i] = INF;
        }


        for (int i = 1; i <= M; i++) {
            int min = dp[i];
            for (int k : N) {
                if (i < k) {
                    continue;
                }
                if (i == k) {
                    min = 1;
                    break;
                }
                min = Math.min(min, dp[i - k] + 1);

            }
            dp[i] = min;
        }
        return dp[M] == INF ? -1 : dp[M];
    }

    public static void main(String[] args) {
        MonetaryComposition monetaryComposition = new MonetaryComposition();
        System.out.println(monetaryComposition.solution(new int[]{3, 5, 7}, 4));

    }
}
