package programmers.exam.e1;

public class E134 {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
        char op = '+';
        while (index < s.length()) {
            if (s.charAt(index) == '+' || s.charAt(index) == '-') {
                op = s.charAt(index++);
                continue;
            }
            StringBuilder stb = new StringBuilder();
            while (index < s.length()) {
                if (s.charAt(index) == '+' || s.charAt(index) == '-') {
                    break;
                }
                stb.append(s.charAt(index++));
            }
            if (op == '+') {
                answer += Integer.parseInt(stb.toString());
                continue;
            }
            answer -= Integer.parseInt(stb.toString());
        }
        return answer;
    }
}
