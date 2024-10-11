import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String infix = "A + B * C + D";
        String postfix = infixToPostfix(infix);
        System.out.println(postfix);
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] tokens = infix.replaceAll(" ", "").toCharArray();

        for (char token : tokens) {
            if (Character.isLetter(token)) {
                postfix.append(token);
            } else if (token == '+' || token == '*') {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    postfix.append(stack.pop());
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
                return 1;
            case '*':
                return 2;
            default:
                return 0;
        }
    }
}
