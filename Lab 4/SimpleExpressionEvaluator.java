import java.util.Scanner;

class Stack {
    int top = -1;
    char[] stack = new char[100];

    void push(char ch) {
        stack[++top] = ch;
    }

    char pop() {
        return stack[top--];
    }

    char peek() {
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class SimpleExpressionEvaluator {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }

    static String infixToPostfix(String infix) {
        Stack stack = new Stack();
        StringBuilder postfix = new StringBuilder();

        for (char ch : infix.toCharArray()) {
            if (Character.isDigit(ch)) {
                postfix.append(ch);  // Add number to output
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix.append(stack.pop());
                stack.pop(); // Remove '('
            } else { // Operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch))
                    postfix.append(stack.pop());
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    static int evaluatePostfix(String postfix) {
        int[] stack = new int[100];
        int top = -1;

        for (char ch : postfix.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack[++top] = ch - '0';  // Convert char to int
            } else {
                int b = stack[top--];
                int a = stack[top--];
                if (ch == '+') stack[++top] = a + b;
                if (ch == '-') stack[++top] = a - b;
                if (ch == '*') stack[++top] = a * b;
                if (ch == '/') stack[++top] = a / b;
            }
        }
        return stack[top];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = scanner.nextLine();

        String postfix = infixToPostfix(infix);
        int result = evaluatePostfix(postfix);

        System.out.println("Postfix: " + postfix);
        System.out.println("Result: " + result);
        scanner.close();
    }
}
