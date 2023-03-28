package programmers;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        if (list.size() == 0) {
            return new int[]{-1};
        }
        return list.stream()
                .sorted(Integer::compareTo)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
