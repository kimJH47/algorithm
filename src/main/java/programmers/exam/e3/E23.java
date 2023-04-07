package programmers.exam.e3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class E23 {
    public String solution(int[] arr, String prefix, String separator, String postfix) {
        StringBuilder stb = new StringBuilder();
        stb.append(prefix);
        stb.append(
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(separator))
        );
        stb.append(postfix);
        return stb.toString();
    }

    public static void main(String[] args) {
        E23 e23 = new E23();
        String solution = e23.solution(new int[]{1, 3, 0, 7, 9}, "<", ", ", ">");
        System.out.println(solution);


    }
}
