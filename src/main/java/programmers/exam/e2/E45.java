package programmers.exam.e2;

import java.util.Arrays;
import java.util.HashMap;

public class E45 {
    public int solution(String[] array, String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String substring = s.substring(0, i + 1);
                hashMap.put(substring, 0);
        }
        return (int)Arrays.stream(array)
                .filter(hashMap::containsKey)
                .count();
    }

    public static void main(String[] args) {
        E45 e45 = new E45();
        int naver = e45.solution(new String[]{"n", "nav", "nev"}, "naver");
        System.out.println(naver);
    }
}
