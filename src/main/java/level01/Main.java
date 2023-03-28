package level01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int[] arr = new int[size];
        for (int i = 0; tokenizer.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        if (check(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

    private static boolean check(int[] arr) {
        int[] peeks = {0, 0, 0, 0};
        int index = 0;
        for (int num : arr) {
            for (int peek : peeks) {
                if (peek < num) {
                    peeks[index] = num;
                    break;
                }
                index++;
            }
            if (index == 4) {
                return false;
            }
            index = 0;
        }
        return true;
    }

}
