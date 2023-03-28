package programmers.hash;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class OnceString {
    public String solution(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
        return hashMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Entry::getKey)
                .map(Object::toString)
                .sorted()
                .collect(Collectors.joining());
    }
}
