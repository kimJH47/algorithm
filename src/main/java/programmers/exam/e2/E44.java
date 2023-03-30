package programmers.exam.e2;

public class E44 {
    public int solution(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(i + "," + j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        E44 e44 = new E44();
        e44.solution(new int[]{2, 5, 6, 3, 2, 6, 6});
    }
}
