package programmers.exam.e3;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class E11 {
    public boolean solution(int[] arr) {
        Collection<Long> values = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()))
                .values();
        long unique = values.stream()
                .distinct()
                .count();
        return values.size() == unique;
    }
}
