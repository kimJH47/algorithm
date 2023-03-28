package programmers.stackqueue;

import java.util.Stack;

public class Jusic {
    public int[] solution(int[] prices) {
        int[] times = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < prices.length; i++) {
            if (prices[st.peek()] > prices[i]) {
                while (!st.isEmpty() && prices[st.peek()] > prices[i]) {
                    Integer time = st.pop();
                    times[time] = i - time;
                }
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            Integer time = st.pop();
            times[time] = prices.length - time - 1;
        }

        return times;
    }

    public static void main(String[] args) {
        Jusic jusic = new Jusic();
        jusic.solution(new int[]{2, 4, 3, 2, 1});
    }
}
