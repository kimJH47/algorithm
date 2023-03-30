package programmers.exam.e2;

public class E55 {
    public String solution(int[] arr) {
        int size = arr.length;
        for (int i = 1; i <= (size / 2) - 1; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < size && arr[left] < arr[i])
                return "NO";
            if (right < size && arr[right] < arr[i])
                return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        E55 e55 = new E55();
        String solution = e55.solution(new int[]{0, 20, 22, 17});
        System.out.println(solution);
    }
}
