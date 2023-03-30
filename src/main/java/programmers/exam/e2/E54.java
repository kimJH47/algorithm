package programmers.exam.e2;


public class E54 {
    public int solution(int n) {
        int max = 1_000_000_007;
        long index = 2;
        long result = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * index) % max;
            }
            index = (index * index) % max;
            n = n / 2;
        }

        return (int) ((result - 1 + max) % max);
    }

    public static void main(String[] args) {
        E54 e54 = new E54();
        System.out.println(e54.solution(6));


    }
}

//class Solution {
//    public int solution(int n) {
//        long result = 0;
//        for (int i = 0; i < n; i++) {
//            result += Math.pow(2, i) % 1_000_000_007 ;
//        }
//        return (int)(result % 1_000_000_007);
//    }
//
//}