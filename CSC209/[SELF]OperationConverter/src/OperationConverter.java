import java.util.Stack;

public class OperationConverter {

    public static String infixToPostfix(String infix) {
        String output = "";
        Stack<Character> temp = new Stack<>();
        char[] chars = infix.toCharArray();
        boolean isOpen = true;
        for (char c : chars) {
            if (c == ' ') {
                continue;
                // Operand
            } else if (precedence(c) == 0) {
                output += c;
                // Open parentheses
            } else if (c == '(') {
                temp.push(c);
                // Close parentheses
            } else if (c == ')') {
                while (!temp.isEmpty() && temp.peek() != '(') {
                    output += temp.pop();
                }
                if (!temp.isEmpty() && temp.peek() != '(') {
                    return "Error with parentheses";
                } else {
                    temp.pop();
                }
            } else {
                while (!temp.isEmpty() && precedence(c) <= precedence(temp.peek())) {
                    if (temp.peek() == '(')
                        return "Error with parentheses";
                    output += temp.pop();
                }
                temp.push(c);
            }
        }
        //  No more input
        while (!temp.isEmpty()) {
            if (temp.peek() == ')')
                return "Error with parentheses";
            output += temp.pop();
        }
        return output;
    }

    public static double calculatePostfix(String postfix){
        double output = -1.0;
        Stack<String> stack = new Stack<>();
        char[] chars = postfix.toCharArray();
        for (char c: chars) {
            if(c == ' '){
                continue;
            }
            else if(precedence(c) == 0){
                stack.push(String.valueOf(c));
            } else {
                double temp2 = Double.parseDouble(stack.pop());
                double temp1 = Double.parseDouble(stack.pop());
                switch (c){
                    case '+': {
                        temp1 += temp2;
                        stack.push(String.valueOf(temp1));
                    } break;
                    case '–': // ? Handler
                    case '-': {
                        temp1 -= temp2;
                        stack.push(String.valueOf(temp1));
                    } break;
                    case '*': {
                        temp1 *= temp2;
                        stack.push(String.valueOf(temp1));
                    } break;
                    case '/': {
                        temp1 /= temp2;
                        stack.push(String.valueOf(temp1));
                    } break;
                    case '^': {
                        temp1 = Math.pow(temp1, temp2);
                        stack.push(String.valueOf(temp1));
                    }
                    default: ;
                }
            }
        }
        output = Double.parseDouble(stack.pop());
        return output;
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
            case '–': // ?
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        if ('0' <= ch && ch <= '9')
            return 0;
        return -1;
    }
}
