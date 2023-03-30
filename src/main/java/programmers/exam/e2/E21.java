package programmers.exam.e2;

import java.util.Arrays;

public class E21 {
    public int solution(int[] useageArr, int fee) {
        return Arrays.stream(useageArr)
                .sum() * fee;
    }
}
