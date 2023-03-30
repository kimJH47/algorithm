package programmers.string;

public class Gcd {
    public int solution(int[] A) {
        int gcd = A[0];
        for (int i = 1; i < A.length; i++) {
            gcd = gcd(gcd, A[i]);
        }
        return gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
