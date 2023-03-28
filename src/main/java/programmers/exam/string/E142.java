package programmers.exam.string;

public class E142 {
    public int solution(String[] arr) {
        int answer = 0;
        for(String str : arr){
            answer^=Integer.parseInt(str,2);
        }
        return answer;
    }
}
