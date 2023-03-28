package programmers.exam.E2;

import java.util.HashMap;
import java.util.Objects;
import java.util.StringTokenizer;

public class E13 {

    public boolean solution(String p, String s) {
        HashMap<String, Character> hashMap = new HashMap<>();
        StringTokenizer stn = new StringTokenizer(s, " ");

        for (char ch : p.toCharArray()) {
            if (!stn.hasMoreTokens()) {
                return false;
            }

            String key = stn.nextToken();

            if (!hashMap.containsKey(key)) {
                hashMap.put(key, ch);
                continue;
            }

            if (Objects.equals(hashMap.get(key), ch)) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        E13 e13 = new E13();
        System.out.println(e13.solution("가나나가", "집에가고싶다 집에가고싶다 집에가고싶다 집에가고싶다"));
    }
}
