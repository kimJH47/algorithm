package programmers.string;

import java.util.HashMap;

public class StringScreen {
        public String solution(int n, String s, int t) {
            int ci = t % (s.length() + n);
            HashMap<Integer, String> hashMap = new HashMap<>();
            for (int i = 0; i <= ci; i++) {
                if (i > n && i < s.length()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    String substring = s.substring(n, t);
                    stringBuilder.append(".".repeat(n - substring.length()))
                            .append(substring);
                    hashMap.put(i, stringBuilder.toString());
                    continue;
                }
                if (i < n && i > s.length()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    String substring = s.substring(0, i);
                    stringBuilder.append(".".repeat(n - i))
                            .append(substring);
                    hashMap.put(i, stringBuilder.toString());
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                String substring = s.substring(0, i);
                stringBuilder.append(".".repeat(n - i))
                        .append(substring);
                hashMap.put(i, stringBuilder.toString());
            }

            return "null";
    }
}
