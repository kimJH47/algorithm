package programmers.hash;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : participant) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
                continue;
            }
            hashMap.put(s, 1);
        }
        for (String s : completion) {
            hashMap.put(s, hashMap.get(s) - 1);
        }
        return hashMap.entrySet()
                .stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getValue() != 0)
                .map(Entry::getKey)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Marathon marathon = new Marathon();
        marathon.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
    }

}
