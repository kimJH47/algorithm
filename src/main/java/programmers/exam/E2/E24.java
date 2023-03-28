package programmers.exam.E2;
import java.util.HashMap;
import java.util.Map.Entry;

class E24 {
    public int solution(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num : arr){
            hashMap.put(num,hashMap.getOrDefault(num,1) + 1);
        }
        return hashMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .limit(1)
                .map(Entry::getKey)
                .findAny()
                .orElse(0);

    }

    public static void main(String[] args) {
        E24 e24 = new E24();
        e24.solution(new int[]{1, 2, 1});
    }
}