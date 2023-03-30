package programmers.exam.e2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class E43 {
    public int solution(String S1, String S2) {
        Deque<String> dq1 = getStrings(S1);
        Deque<String> dq2 = getStrings(S2);
        System.out.println(dq1);
        System.out.println(dq2);
        while (!dq1.isEmpty()) {
            if (!Objects.equals(dq1.remove(), dq2.removeLast())) {
                return 1;
            }
        }
        return 1;
    }

    private Deque<String> getStrings(String S1) {
        Deque<String> dq = new ArrayDeque<>();
        char[] arr = S1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder stb = new StringBuilder();
            stb.append(arr[i]);
            if (Character.isUpperCase(arr[i])) {
                while (i + 1 < S1.length() && Character.isLowerCase(arr[i + 1])) {
                    stb.append(arr[i + 1]);
                    i++;
                }
            }
            dq.add(stb.toString());
        }
        return dq;
    }

    public static void main(String[] args) {
        E43 e43 = new E43();
        System.out.println(e43.solution("AAAbAbAbAbAb", "AbAbAbAbAbAA"));
        int solution2 = e43.solution("HiMyFriends", "FriendsMyHi");
        int solution3 = e43.solution("abscascasAB", "BAabscascas");
        System.out.println(solution2);
        System.out.println(solution3);
    }
}

