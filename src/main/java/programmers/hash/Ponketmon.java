package programmers.hash;

import java.util.HashMap;

public class Ponketmon {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int types = 0;
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
                continue;
            }
            hashMap.put(num, 1);
            types++;
        }
        return Math.min(types, nums.length / 2);
    }

}
