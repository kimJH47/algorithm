package programmers.exam.e2;

import java.util.Arrays;


public class E51 {
    public int solution(String sentence, String word) {

        String[] split = sentence.split(" ");
        System.out.println(Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
            if (split[i].equals(word.trim())) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        E51 e51 = new E51();
        int solution = e51.solution("Hello every word", "word");
        System.out.println(solution);
    }
}
