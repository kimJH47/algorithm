package dp;

public class AntWarrior {
    public int solution(int[] arr) {
        int[] dp = new int[arr.length];
        int a = arr[0];
        int b = Math.max(arr[0], arr[1]);
        int c = -1;
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
            c = Math.max(a + arr[i], b);
            b = a;
            a = c;
        }
        System.out.println(c);
        return dp[arr.length - 1];
    }

    public static void main(String[] args) {
        AntWarrior antWarrior = new AntWarrior();
        int solution = antWarrior.solution(new int[]{1, 3, 1, 5});
        System.out.println(solution);

    }
}
