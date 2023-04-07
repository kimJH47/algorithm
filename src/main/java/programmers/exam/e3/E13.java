package programmers.exam.e3;

public class E13 {
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
                continue;

            }
            result = (9 * odd) % 1_000_000_007;
            odd = result;

        }

        return (int) result;
    }
    public static void main(String[] args) {
        E13 e13 = new E13();
        int solution = e13.solution(3);
        System.out.println(solution);
    }
}
