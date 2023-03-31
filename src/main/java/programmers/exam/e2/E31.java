package programmers.exam.e2;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class E31 {
    public String solution(String s) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            hashMap.put(i, 0);
        }
        for (char ch : s.toCharArray()) {
            int key = Character.getNumericValue(ch);
            hashMap.put(key, hashMap.get(key) + 1);
        }

        return hashMap.entrySet().stream()
                .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

    }

    public static void main(String[] args) {
        E31 e31 = new E31();
        e31.solution("221123");
    }
}
