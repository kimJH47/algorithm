package programmers.string;

public class ClosedZero {
    public int solution(int[] arr) {
        int answer = 101;
        for (int i : arr) {
            answer = Math.min(answer, i);
        }
        return answer;
    }
}
