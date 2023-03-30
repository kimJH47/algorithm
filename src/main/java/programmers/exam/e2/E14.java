package programmers.exam.e2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class E14 {
        public int solution(String s) {
            return Arrays.stream(s.split(" "))
                    .collect(Collectors.groupingBy(word -> word,Collectors.counting()))
                    .size();

    }

    public static void main(String[] args) {
        E14 e14 = new E14();
        e14.solution("hello world nice world");
    }
}

