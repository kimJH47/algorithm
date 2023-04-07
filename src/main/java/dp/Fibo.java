package dp;

public class Fibo {
    public long solution(int n) {
        long a = 1;
        long b = 1;
        long fn = 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        for (int i = 3; i < n + 1; i++) {
            fn = a + b;
            b = a;
            a = fn;
        }
        return fn;
    }
    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        System.out.println(fibo.solution(50));
    }
}
