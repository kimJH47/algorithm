package programmers.exam.string;
import java.util.Stack;

public class E132 {

    public int solution(String S) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        for (char ch : S.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                st.push(ch);
                continue;
            }
            char pop = st.pop();
            if (ch == ')' && pop == '(') {
                continue;
            }
            if (ch == '}' && pop == '{') {
                continue;
            }
            if (ch == ']' && pop == '[') {
                continue;
            }
            if (ch == '>' && pop == '<') {
                continue;
            }
            return 0;
        }
        if (!st.isEmpty()) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        E132 e132 = new E132();
        e132.solution("(()){[<>]}");
    }
}
