package beakjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        int size = Integer.parseInt(tokenizer.nextToken());
        int key = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int sum = 0;
        int start = 0, end = 0, count = 0;

        while (true) {
            if (sum >= key) {
                sum -= arr[start++];
            } else if (end == size) {
                break;
            } else {
                sum += arr[end++];
            }
            if (sum == key) {
                count++;
            }
        }
        System.out.println(count);
    }
}
