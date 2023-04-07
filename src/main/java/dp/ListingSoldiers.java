package dp;

public class ListingSoldiers {
    public int solution(int[] arr) {
        int sum = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (sum + arr[i] < arr[i + 1]) {
                    sum = arr[i + 1];
                    count += i;
                    continue;
                }
                count++;
                continue;
            }
            sum += arr[i];
        }
        return count;
    }

    public static void main(String[] args) {
        ListingSoldiers listingSoldiers = new ListingSoldiers();
        int solution = listingSoldiers.solution(new int[]{15, 11, 8, 5, 2, 1});
        System.out.println(solution);
    }
}
