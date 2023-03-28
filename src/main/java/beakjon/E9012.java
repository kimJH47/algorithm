package beakjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class E9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(bufferedReader.readLine());
        }
        ArrayList<String> result = new ArrayList<>();
        for (String s1 : list) {
            int count = 0;
            char[] charArray = s1.toCharArray();
            int index = 0;
            while (index < charArray.length) {
                char character = charArray[index];
                if ('(' == character) {
                    count++;
                    index++;
                    continue;
                }
                if (count == 0) {
                    result.add("NO");
                    break;
                }
                count--;
                index++;
            }
            if (count != 0) {
                result.add("NO");
                continue;
            }
            if (index == s1.length()) {
                result.add("YES");
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
