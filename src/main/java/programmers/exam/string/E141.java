package programmers.exam.string;

import java.lang.StringBuilder;
public class E141{
    public String solution(int[] arr) {
        StringBuilder stb = new StringBuilder();
        for(int n : arr){
            stb.append(Character.toChars(n));
        }
        return stb.toString();
    }
}