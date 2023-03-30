package programmers.exam.e2;


public class E34 {
    public int solution(int A, int B) {
        int[] a = createBinArray(A);
        int[] b = createBinArray(B);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        return count;
    }

    private int[] createBinArray(int num) {
        int[] bin = new int[7];
        int x = 0;
        while (num > 0) {
            // store the remainder in the array
            bin[x] = num % 2;
            num = num / 2;
            x++;
        }
        return bin;
    }


    public static void main(String[] args) {
        E34 e34 = new E34();
        System.out.println(e34.solution(29, 15));

    }
}
