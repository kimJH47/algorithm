package programmers.exam.e3;

public class E15 {
    public int solution(int n, int price) {
        int candiesBought = 0;
        int bonus = 0;
        while (candiesBought + bonus < n) {
            candiesBought++;
            if (candiesBought % 10 == 0) {
                bonus++;
            }
        }

        return candiesBought * price;
    }

    public static void main(String[] args) {
        E15 e15 = new E15();
        int solution = e15.solution(20, 5);
        System.out.println(solution);
    }
}
