package programmers.exam.e1;

public class E154 {
    public int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);
        if(sqrt * sqrt == n){
            return (int)sqrt;
        }
        return 0;
    }
    public static void main(String[] args) {
        E154 e154 = new E154();
        e154.solution(4);
    }
}
