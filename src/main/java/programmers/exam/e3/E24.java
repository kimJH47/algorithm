package programmers.exam.e3;

import java.util.Objects;

public class E24 {
    public boolean solution(boolean[][] matrix, boolean b) {
        for(boolean[] arr : matrix){
            if(contains(arr,b)){
                return false;
            }
        }
        return true;
    }

    private boolean contains(boolean[] arr, boolean b) {
        for (boolean em : arr) {
            if (!Objects.equals(em, b)) {
                return false;
            }
        }
        return true;
    }
}
