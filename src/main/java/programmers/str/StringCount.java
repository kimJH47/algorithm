package programmers.str;


import java.util.Comparator;
import java.util.HashMap;

import java.util.Map.Entry;

public class StringCount {
    public int solution(String s) {
        int answer = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        Character character = hashMap.entrySet()
                .stream()
                .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                .findAny()
                .map(Entry::getKey)
                .orElse('-');

        return Character.getNumericValue(character);
    }
}
//
//    public int solution(String s) {
//        int answer = 0;
//        HashMap<Character,Integer> hashMap = new HashMap<>();
//        for(char ch : s.toCharArray()){
//            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
//        }
//        Character character = hashMap.entrySet()
//                .stream()
//                .sorted((o1, o2) -> {
//                    Integer value1 = o1.getValue();
//                    Integer value2 = o2.getValue();
//                    if (value1.equals(value2)) {
//                        return Character.getNumericValue(o1.getKey()) - Character.getNumericValue(o1.getKey());
//                    }
//                    return value2 - value1;
//                })
//                .findAny()
//                .map(Entry::getKey)
//                .orElse('-');
//        return Character.getNumericValue(character);
//    }