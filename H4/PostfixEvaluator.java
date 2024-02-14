package H4;

import java.util.Stack;

public class PostfixEvaluator {
    /////3
    public static int evaluatePostfix(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfixExpression.length(); i++) {
            char ch = postfixExpression.charAt(i);

            if (Character.isDigit(ch)) {
                // If the character is a digit, push it onto the stack
                stack.push(ch - '0');
            } else if (ch != ' ') {
                // If the character is an operator, perform the corresponding operation
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        // The final result is the only element left on the stack
        return stack.pop();
    }

//    public static void main(String[] args) {
//        String postfixExpression = "5 2 + 8 3 - * 4 /";
//        int result = evaluatePostfix(postfixExpression);
//
//        System.out.println("Result: " + result);
//    }
    ////5
    public static int evaluatePostfixExpression(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result;

                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + ch);
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

//    public static void main(String[] args) {
//        String postfixExpression = "52+83-*4/";
//
//        int result = evaluatePostfixExpression(postfixExpression);
//        System.out.println("Result: " + result);
//    }
}

