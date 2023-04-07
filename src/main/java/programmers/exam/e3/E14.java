package programmers.exam.e3;

import java.util.ArrayDeque;

public class E14 {
    public String solution(String s) {
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (Character character : s.toCharArray()) {
            dq.add(character);
        }
        int hands = 0;
        while (!dq.isEmpty() && hands < 2) {
            Character peek = dq.peek();
            System.out.println(peek);
            if (peek == '1') {
                int count = 0;
                while (!dq.isEmpty() && count < 3) {
                    count++;
                    dq.pop();
                }
                hands++;
                continue;
            }
            dq.pop();
        }
        if (dq.contains('1')) {
            return "NO";
        }
        return "YES";

    }

    public static void main(String[] args) {
        E14 e14 = new E14();
        e14.solution("111000010100");
        e14.solution("001001000100");
    }
}
