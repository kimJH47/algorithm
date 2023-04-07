package programmers.exam.e3;

import java.util.HashMap;
import java.util.Map.Entry;

public class E22 {
    public int[] solution(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num : arr1){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        for(int num : arr2){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        return hash.entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .mapToInt(Entry::getKey)
                .sorted()
                .toArray();
    }
}
