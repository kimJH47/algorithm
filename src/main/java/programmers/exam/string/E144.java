package programmers.exam.string;

public class E144 {
    public String solution(String s) {
        Integer num = Integer.parseInt(s, 16);
        System.out.println(num);
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        E144 e144 = new E144();
        e144.solution("f4");
    }
}
