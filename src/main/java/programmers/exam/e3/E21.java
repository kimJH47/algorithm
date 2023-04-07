package programmers.exam.e3;

public class E21 {
    public int solution(String s, int n) {
        return (int) s.chars()
                .filter(ch -> Character.getNumericValue(ch) == n)
                .count();
    }
}
