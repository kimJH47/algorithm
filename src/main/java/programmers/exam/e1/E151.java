package programmers.exam.e1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class E151 {
    public String solution(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        return hashMap.entrySet().stream()
                .sorted(Entry.<Character, Integer>comparingByValue().reversed()
                        .thenComparing(Entry.comparingByKey()))
                .limit(1)
                .map(entry -> Character.toString(entry.getKey()))
                .collect(Collectors.joining());
    }
}
