package programmers.exam.e2;

import java.util.ArrayDeque;
import java.util.Deque;

public class E33 {
    public double solution(String s) {
        Deque<Double> dq = new ArrayDeque<>();
        String[] tokens = toPostfix(s).split(" ");
        for (String token : tokens) {
            if (isOperate(token)) {
                double operand2 = dq.pop();
                double operand1 = dq.pop();
                double result = applyOperator(token.charAt(0), operand1, operand2);
                dq.push(result);
            } else {
                double operand = Double.parseDouble(token);
                dq.push(operand);
            }
        }
        Double pop = dq.pop();
        return Double.parseDouble(String.format("%.2f", pop));
    }

    private boolean isOperate(String str) {
        return str.length() == 1 && "+-*/".contains(str);
    }

    private double applyOperator(char operator, double operand1, double operand2) {
        if (operator == '+') {
            return operand1 + operand2;
        }
        if (operator == '-') {
            return operand1 - operand2;
        }
        if (operator == '*') {
            return operand1 * operand2;
        }
        if (operator == '/') {
            return operand1 / operand2;
        }
        return 0;
    }


    private String toPostfix(String infix) {
        Deque<Character> dq = new ArrayDeque<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isDigit(ch)) {
                StringBuilder operand = new StringBuilder();
                while (i < infix.length() && Character.isDigit(infix.charAt(i))) {
                    operand.append(infix.charAt(i));
                    i++;
                }
                i--;
                postfix.append(operand).append(" ");
            }
            if (isOp(ch)) {
                while (!dq.isEmpty() && hasHigherOperate(dq.peek(), ch)) {
                    postfix.append(dq.pop()).append(" ");
                }
                dq.push(ch);
            }
        }
        while (!dq.isEmpty()) {
            postfix.append(dq.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    private boolean isOp(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private boolean hasHigherOperate(char operator1, char operator2) {
        int precedence1 = getPriority(operator1);
        int precedence2 = getPriority(operator2);
        return (precedence1 > precedence2 || (precedence1 == precedence2));
    }

    private int getPriority(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        }
        if (ch == '*' || ch == '/') {
            return 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        String infixExpression = "10/3";
        E33 e33 = new E33();

        System.out.println(e33.solution(infixExpression));
    }
}