package programmers.exam.e2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E32 {

    public int[] solution(int[] nums) {

        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        return IntStream.rangeClosed(1, nums.length)
                .filter(value -> !list.contains(value))
                .toArray();
    }

    public static void main(String[] args) {
        E32 e32 = new E32();
        e32.solution(new int[]{4, 3, 2, 1});
    }
}

//
//    public int[] solution(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        int key = 1;
//        int index = 0;
//        while (key <= nums.length) {
//            while (key <= nums.length) {
//                if (key == nums[index]) {
//                    break;
//                }
//                list.add(key);
//                key++;
//            }
//            index++;
//            key++;
//        }
//
//        return list.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//    }