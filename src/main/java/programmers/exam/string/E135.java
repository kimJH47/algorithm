package programmers.exam.string;

import java.util.HashMap;
import java.lang.StringBuilder;

public class E135 {
    public String solution(String[] bj, String[] one, String[] two) {

        HashMap<String, Integer> hm = new HashMap<>();

        for (String str : one) {
            hm.put(str, 1);
        }
        for (String str : two) {
            hm.put(str, 2);
        }
        StringBuilder stb = new StringBuilder();
        stb.append((one.length + (two.length * 2) + 3) * 150)
                .append("만원(");
        for (String str : bj) {
            if (!hm.containsKey(str)) {
                stb.append(str).append(")");
                break;
            }
        }
        return stb.toString();

    }
}
