package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution04 {

    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int peek = -1;
        for (int i : arr) {
            if (peek != i) {
                list.add(i);
                peek = i;
            }
        }
        return list.stream().mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        Solution04 solution04 = new Solution04();
        int[] arr = {1, 1, 3, 3, 0, 1, 1,};
        int[] solution = solution04.solution(arr);
        System.out.println(Arrays.toString(solution));
    }


}
