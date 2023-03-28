package programmers.stackqueue;

public class Solution {
    public boolean solution(String s) {
        int count = 0;
        for (char s1 : s.toCharArray()) {
            if (s1 == '(') {
                count++;
                continue;
            }
            if (count == 0) {
                return false;
            }
            count--;
        }
        return count == 0;
    }
}

//    boolean solution(String s) {
//        List<String> collect = Arrays.stream(s.split(""))
//                .collect(Collectors.toList());
//        Stack<String> st = new Stack<>();
//        for (String s1 : collect) {
//            if ("(".equals(s1)) {
//                st.push(s1);
//                continue;
//            }
//            if (st.isEmpty() || st.peek().equals(")")) {
//                return false;
//            }
//            st.pop();
//        }
//        return st.size()==0;
//    }