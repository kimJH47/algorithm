import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Test01 {

    @Test
    public void test() throws Exception {
        //given
        Solution solution = new Solution();
        int solution1 = solution.solution(100000);
    }
    @Test
    public void Hash() throws Exception{
        //given
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("1", 1);
        //when
    }
    @Test
    public void hash2() throws Exception{
        //given
        Solution solution = new Solution();
        int hash = hash(solution);
        //when
        int i = solution.hashCode() ^ solution.hashCode() >>> 16;
        System.out.println(i);
        System.out.println(hash);
        System.out.println(solution.hashCode() >>> 16);
        System.out.println(100 & hash);
        System.out.println(99 & hash);
        System.out.println(100 & hash);
        //then
    }
    @Test
    public void substring() throws Exception{
        //given
        String value = "abcdef";
        //when
        for (int i = 0; i < value.length(); i++) {
            System.out.println(i);
            System.out.println(value.substring(0, i));
        }
        //then
    }
    static final int hash(Object key) {
        int h;
        if (key == null) {
            return 0;
        }
        return (key.hashCode()) ^ (key.hashCode() >>> 16);
    }
    @Test
    public void valueObject() throws Exception{
        //given
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        //when
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(20);
        List<Integer> a1 = hashMap.put("a", objects);
        List<Integer> a2 = hashMap.putIfAbsent("a", new ArrayList<>());
        a2.add(10);
        //then
        System.out.println(a1);
        System.out.println(a2);


    }


}
class Solution {
    public int solution(int price) {
        if(price > 500000){
            return (int)(price * 0.8);
        }
        if(price > 300000){
            return (int)(price * 0.9);
        }
        if(price > 100000){
            double a = price * 0.95;
            int b = (int)a;
            return (int)(price * 0.95);
        }
        return price;
    }
}
