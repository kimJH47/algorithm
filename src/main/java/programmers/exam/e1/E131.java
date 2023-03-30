package programmers.exam.e1;

import java.util.Stack;

public class E131 {
    public String solution(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder stb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (st.isEmpty()) {
                st.push(ch);
                continue;
            }
            if (st.peek() != ch) {
                st.push(ch);
                continue;
            }
            st.pop();
        }
        for (Character character : st) {
            stb.append(character);
        }
        return stb.toString();

    }

    public static void main(String[] args) {
        E131 e131 = new E131();
        e131.solution("aacddefg");
    }
}
