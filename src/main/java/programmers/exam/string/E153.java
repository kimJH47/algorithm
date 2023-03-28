package programmers.exam.string;

public class E153 {
    public String solution(String s) {
        return new StringBuilder(s)
                .reverse()
                .toString();
    }
}
