package beakjon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E1254 {
    public static void main(String[] args) throws Exception {
        System.out.println(solve(input()));
    }

    public static int solve(String input) {
        if(input.equals(new StringBuilder(input).reverse().toString())) {
            return input.length();
        }

        for(int i = 1; i < input.length(); i++) {
            StringBuilder sb = new StringBuilder(input);
            sb.append(new StringBuilder(input.substring(0, i)).reverse());
            if(sb.toString().equals(sb.reverse().toString())) {
                return sb.length();
            }
        }

        return -1;
    }

    public static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
