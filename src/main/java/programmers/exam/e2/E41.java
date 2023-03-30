package programmers.exam.e2;

public class E41 {
    public int solution(int N, int K) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count+=solve(i, K);
        }
        return count;
    }

    private int solve(int i, int k) {
        String s = String.valueOf(i);
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (k == Character.getNumericValue(ch)) {
                count++;
            }
        }
        return count;
    }
}
