package programmers.hash;

import java.util.HashMap;
import java.util.Set;

public class Spy {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String[] clothe : clothes) {
            String clotheType = clothe[1];
            if (!hashMap.containsKey(clotheType)) {
                hashMap.put(clotheType, 1);
                continue;
            }
            hashMap.put(clotheType, hashMap.get(clotheType) + 1);
        }
        Set<String> keySet = hashMap.keySet();
        int answer = 1;
        for (String s : keySet) {
            answer *= hashMap.get(s) + 1;
        }

        return answer -1;
    }
}
