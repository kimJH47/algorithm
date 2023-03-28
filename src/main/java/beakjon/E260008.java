package beakjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class E260008 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int a = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(reader.readLine(), " ");
        int key = Integer.parseInt(tokenizer.nextToken());
        long h = 1L;
        for (int i = 0; i < n - 1; i++) {
            h = h* m % 1000000007;
        }
        System.out.println(h);


    }
}