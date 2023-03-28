package beakjon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E2830 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[n];
        int[] bytes = new int[21];
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
        }
        System.out.println(result);
    }
}
