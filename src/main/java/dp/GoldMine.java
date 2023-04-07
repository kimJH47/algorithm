package dp;

public class GoldMine {
    public int solution(int[][] arr) {
        int[][] dp = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            dp[i] = new int[arr[0].length];
            dp[i][0] = arr[i][0];
        }
        for (int i = 1; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    dp[j][i] = arr[j][i] + Math.max(dp[j + 1][i - 1], dp[j][i - 1]);
                    continue;
                }
                if (j == arr.length - 1) {
                    dp[j][i] = arr[j][i] + Math.max(dp[j - 1][i - 1], dp[j][i - 1]);
                    continue;
                }
                dp[j][i] = Math.max(dp[j][i], arr[j][i] + dp[j][i - 1]);
                dp[j][i] = Math.max(dp[j][i], arr[j][i] + dp[j + 1][i - 1]);
                dp[j][i] = Math.max(dp[j][i], arr[j][i] + dp[j - 1][i - 1]);
            }
        }
        int result = -1;
        for (int[] ints : dp) {
            result = Math.max(result, ints[ints.length - 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        GoldMine goldMine = new GoldMine();
        int solution = goldMine.solution(new int[][]{{1, 3, 3, 2}, {2, 1, 4, 1}, {0, 6, 4, 7}});
        System.out.println(solution);
    }
}
