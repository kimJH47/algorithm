package programmers.str;


import java.util.ArrayList;
import java.util.Stack;

public class StackE {
    public String[] solution(String s) {
        Stack<Character> st = new Stack<>();
        ArrayList<String> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '?' || ch == '!' || ch == ',' || ch == ' ' ||ch =='.') {
                StringBuilder stb = new StringBuilder();
                while (!st.isEmpty()) {
                    Character pop = st.pop();
                    stb.append(pop);
                }
                if (stb.toString().length() > 0) {
                    list.add(stb.toString());
                }
                continue;
            }
            st.push(ch);
        }
        StringBuilder stb = new StringBuilder();
        while (!st.isEmpty()) {
            Character ch = st.pop();
            stb.append(ch);
        }
        if (stb.toString().length() > 0) {
            list.add(stb.toString());
        }
        return list.toArray(String[]::new);
    }

    public static void main(String[] args) {
        StackE stackE = new StackE();
        stackE.solution("!!!!   H, E");
    }
}
