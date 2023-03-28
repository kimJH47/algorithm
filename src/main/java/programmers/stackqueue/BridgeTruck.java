package programmers.stackqueue;

import java.util.LinkedList;

public class BridgeTruck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        LinkedList<Integer> list = new LinkedList<>();
        int present = truck_weights[0];
        int time = 1;
        int next = 1;
        int index = 0;
        list.add(time);
        while (next < truck_weights.length) {
            time++;
            if (list.peekFirst() + bridge_length == time) {
                list.removeFirst();
                present -= truck_weights[index++];
            }
            int truck = truck_weights[next];
            if (present + truck <= weight && list.size() < bridge_length) {
                list.add(time);
                present += truck;
                next++;
            }
        }
        return list.peekLast() + bridge_length;
    }

    public static void main(String[] args) {
        BridgeTruck bridgeTruck = new BridgeTruck();
        bridgeTruck.solution(2, 10, new int[]{7, 4, 5, 6});
    }

}
