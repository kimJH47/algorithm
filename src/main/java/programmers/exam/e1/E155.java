package programmers.exam.e1;

public class E155 {
    public String solution(String s) {
        StringBuilder stb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch <= 'Z' && ch >= 'A'){
                stb.append(Character.toLowerCase(ch));
                continue;
            }
            stb.append(Character.toUpperCase(ch));
        }
        return stb.toString();
    }
}