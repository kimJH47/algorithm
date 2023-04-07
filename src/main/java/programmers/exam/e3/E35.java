package programmers.exam.e3;

public class E35 {
    public int solution(int[] fruits) {
        if (fruits.length == 1) {
            return fruits[0];
        }
        int cache = fruits[0];
        int result = -10001;
        for (int i = 1; i < fruits.length; i++) {
            cache = Math.max(fruits[i], cache + fruits[i]);
            result = Math.max(result, cache);
        }
        return result;
    }

    public static void main(String[] args) {
        int solution = new E35().solution(new int[]{-2, 5, -3, 6, 8, -1, -5, 3});
        int solution2 = new E35().solution(new int[]{1});
        System.out.println(solution);
        System.out.println(solution2);
    }
}
