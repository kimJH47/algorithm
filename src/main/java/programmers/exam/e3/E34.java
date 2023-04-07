package programmers.exam.e3;

public class E34 {
    public int solution(int A) {
        int[] coins = {50000, 10000, 5000, 1000, 500, 100, 50, 5, 1};
        int index = 0;
        int count = 0;
        while (A > 0) {
            if (A < coins[index]) {
                index++;
                continue;
            }
            count = count + A / coins[index];
            A = A % coins[index];
        }
        return count;
    }

    public static void main(String[] args) {
        E34 e34 = new E34();
        int solution = e34.solution(12345);
        System.out.println(solution);
    }
}
