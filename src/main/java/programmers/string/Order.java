package programmers.string;

import java.util.HashMap;

public class Order {

        public int solution(int[] orders, int n) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int order : orders) {
                hashMap.put(order, 1);
            }
            int count = 0;
            int orderNum = 0;
            while (count < n) {
                orderNum++;
                if (hashMap.containsKey(orderNum)) {
                    continue;
                }
                count++;
            }
            return orderNum;
    }
}
