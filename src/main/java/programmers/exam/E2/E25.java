package programmers.exam.E2;


public class E25 {
    public int solution(int num) {
        StringBuilder stb = new StringBuilder();
        if (num < 0) {
            stb.append("-");
        }
        char[] arr = String.valueOf(Math.abs(num)).toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            stb.append(arr[i]);
        }
        int result = Integer.parseInt(stb.toString());
        if (result < -100000 || result > 100000) {
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        E25 e25 = new E25();
        String s = String.valueOf(-100);
        System.out.println(s);
        e25.solution(1);
    }
}
