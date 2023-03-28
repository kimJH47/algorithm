package beakjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        int maxValue = -1000001;
        int minValue = 1000001;
        while (tokenizer.hasMoreTokens()) {
            int num = Integer.parseInt(tokenizer.nextToken());
            if (maxValue < num) {
                maxValue = num;

            }
            if (minValue > num) {
                minValue = num;
            }
        }
        String stringBuilder = minValue
                + " "
                + maxValue;
        System.out.println(stringBuilder);
    }
}

