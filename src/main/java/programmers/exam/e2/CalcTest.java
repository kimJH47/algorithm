package programmers.exam.e2;

public class CalcTest {
    public static void main(String[] args) {
        String expression = "10+10*3"; // example expression

        double result = evaluate(expression);
        System.out.println(expression + " = " + result);
    }

    public static double evaluate(String expression) {
        char[] tokens = expression.toCharArray();

        // Initialize operands and operator
        double operand1 = 0, operand2 = 0;
        char operator = ' ';

        // Loop through the tokens
        for (int i = 0; i < tokens.length; i++) {
            // If current token is a whitespace, skip it
            if (tokens[i] == ' ') {
                continue;
            }

            // If current token is a digit, parse it as operand
            if (Character.isDigit(tokens[i])) {
                double operand = 0;
                while (i < tokens.length && Character.isDigit(tokens[i])) {
                    operand = operand * 10 + (tokens[i] - '0');
                    i++;
                }
                if (operator == ' ') {
                    operand1 = operand;
                } else {
                    operand2 = operand;
                }
                i--;
            } else { // If current token is an operator, set it
                operator = tokens[i];
            }

            // If both operands and operator are set, evaluate the expression
            if (operand1 != 0 && operand2 != 0 && operator != ' ') {
                operand1 = applyOperator(operator, operand1, operand2);
                operand2 = 0;
                operator = ' ';
            }
        }

        // Return the final result
        return operand1;
    }

    public static double applyOperator(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}