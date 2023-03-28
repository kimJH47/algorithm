package beakjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

public class E5613 {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Long> nums = new ArrayDeque<>();
        ArrayDeque<String> op = new ArrayDeque<>();
        StringBuilder stb = new StringBuilder();

        while (true) {
            String str = read.readLine();

            if (Objects.equals(str, "=")) {

                break;
            }
            if (Pattern.matches("[0-9]+", str)) {
                stb.append(str);
                continue;
            }
            op.add(str);
            nums.add(Long.valueOf(stb.toString()));
            stb.setLength(0);
        }

        if (stb.length() > 0) {
            nums.add(Long.valueOf(stb.toString()));
        }

        Calculator calculator = new Calculator();
        calculator.addOperateToString("+", Long::sum);
        calculator.addOperateToString("-", (a, b) -> a - b);
        calculator.addOperateToString("*", (a, b) -> a * b);
        calculator.addOperateToString("/", (a, b) -> a / b);
        long result = 0;
        while (!op.isEmpty()) {
            result = calculator.calculate(nums.removeFirst(), nums.removeFirst(), op.remove());
            nums.addFirst(result);
        }
        System.out.println(result);
    }
}

class Calculator {

    Map<String, Operate> operateMap = new HashMap<>();

    public Calculator() {
    }

    public void addOperateToString(String op, Operate operate) {
        operateMap.put(op, operate);
    }

    public long calculate(long a, long b, String operate) {
        return operateMap.get(operate).operation(a, b);
    }
}

@FunctionalInterface
interface Operate {
    long operation(long a, long b);
}
