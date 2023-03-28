package programmers.exam.string;

import java.util.Stack;

public class E133 {
    public int solution(String S) {
        Stack<Character> st = new Stack<>();
        char[] chars = S.toCharArray();
        st.push(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (st.isEmpty() || st.peek() != chars[i]) {
                st.push(chars[i]);
                continue;
            }
            if (st.peek() == chars[i]) {
                char ch = st.pop();
                while (!st.isEmpty()) {
                    if (ch == st.peek()) {
                        st.pop();
                        continue;
                    }
                    break;
                }
            }
        }
        if (st.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        E133 e133 = new E133();
        e133.solution("AABCCBAADDA");
    }
}
