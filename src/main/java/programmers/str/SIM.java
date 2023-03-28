package programmers.str;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SIM {
    public int solution(int[] A) {
        int answer = 0;
        int min = 0;
        int max = 0;
        List<Integer> list = IntStream.range(0, A.length - 1)
                .boxed()
                .sorted(Comparator.comparingInt(o -> A[o]))
                .collect(Collectors.toList());
        for(int buy : list){
            int score = A[buy+1] - A[buy];
            for(int i = buy +2; i < A.length; i++){
                score = Math.max(score, A[i] - A[buy]);
            }
            answer = Math.max(answer, score);

        }
        return answer;
    }

    public static void main(StringCount[] args) {
        SIM sim = new SIM();
        sim.solution(new int[]{100000, 98000, 95000, 98000, 92000});
    }
}
