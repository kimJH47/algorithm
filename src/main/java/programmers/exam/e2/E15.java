package programmers.exam.e2;

import java.util.HashMap;
import java.util.Map.Entry;

class E15 {
    public int[] solution(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : arr1) {
            hashMap.put(num, 0);
        }

        for (int num : arr2) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            }
        }
        return hashMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .mapToInt(Entry::getKey)
                .sorted()
                .toArray();
    }
}
