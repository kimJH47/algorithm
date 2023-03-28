package beakjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class E10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        HashMap<String, Integer> hashMap = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine(), " ");
        while (stringTokenizer.hasMoreTokens()) {
            String str = stringTokenizer.nextToken();
            hashMap.put(str,hashMap.getOrDefault(str, 0) + 1);
        }

        System.out.println(hashMap.getOrDefault(reader.readLine(),0));

    }
}
