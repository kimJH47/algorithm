package programmers.exam.e2;

class E23 {
    public int solution(int n) {
        double result = 1;
        int i = 1;
        while(true){
            if(Math.pow(i,3) <= n){
                result = Math.pow(i,3);
                i++;
                continue;
            }
            break;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        E23 e23 = new E23();
        e23.solution(15);
    }
}
