package programmers.exam.string;

import java.util.stream.IntStream;

public class E152 {
    public boolean solution(int n) {
        return IntStream.range(2, n)
                .noneMatch(value -> n % value == 0);
    }
}
