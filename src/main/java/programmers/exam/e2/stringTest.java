package programmers.exam.e2;

public class stringTest {
        public int solution(String S1, String S2) {
            S1 = S1 + S1;

            if (!S1.contains(S2)) {
                return 0;
            } else {
                return 1;
            }
    }

    public static void main(String[] args) {
        stringTest stringTest = new stringTest();
        int solution = stringTest.solution("HelloMyFr", "FrMyHello");
        System.out.println(solution);
    }
}
