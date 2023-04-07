package programmers.exam.e3;

import java.util.Arrays;

public class E32 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        int count = 0;
        while (start <= end) {
            if (people[start] + people[end] > limit) {
                end--;
                count++;
                continue;
            }
            start++;
            end--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        E32 e32 = new E32();
        e32.solution(new int[]{45, 50, 51, 49, 90, 70}, 100);
        e32.solution(new int[]{100, 100, 100, 100, 100, 70}, 100);
    }

}
