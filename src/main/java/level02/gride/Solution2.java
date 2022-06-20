package level02.gride;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    public static String solution(String number, int k) {
        StringBuffer answer =new StringBuffer("");
        String[] arr = number.split("");
        List<Integer> list = new ArrayList<>();

        for(String a :arr) {
            list.add(Integer.parseInt(a));
        }

        Stack<Integer> st = new Stack<>();

        int index = 0;

        while(index<list.size()) {
            int num = list.get(index++);
            while(!st.isEmpty()&&k>0&&st.peek()<num)
            {
                k--;
                st.pop();
            }

            st.push(num);
        }

        while(!st.isEmpty()&&k>0) {
            k--;
            st.pop();
        }

        for(int i = k ; i<st.size();i++) {
            answer.append(st.get(i));
        }
        return answer.toString();

    }
}
