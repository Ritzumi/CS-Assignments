public class Driver {
    public static void main(String[] args) {
        System.out.println(OperationConverter.infixToPostfix("4 + 6 * 5 / 3 - 2"));
        System.out.println(OperationConverter.calculatePostfix(OperationConverter.infixToPostfix("4 + 6 * 5 / 3 - 2")));
        System.out.println(OperationConverter.infixToPostfix("4 + (6*5/3) - 2"));
        System.out.println(OperationConverter.calculatePostfix(OperationConverter.infixToPostfix("4 + (6*5/3) - 2")));
        System.out.println(OperationConverter.infixToPostfix("(4 + 6) * 5/3 - 2"));
        System.out.println(OperationConverter.calculatePostfix(OperationConverter.infixToPostfix("(4 + 6) * 5/3 - 2")));
        System.out.println(OperationConverter.infixToPostfix("4 * 6 * 5 + 3 - 2"));
        System.out.println(OperationConverter.calculatePostfix(OperationConverter.infixToPostfix("4 * 6 * 5 + 3 - 2")));
        System.out.println(OperationConverter.infixToPostfix("4 * 6 + 5 *  3 ^ 2"));
        System.out.println(OperationConverter.calculatePostfix(OperationConverter.infixToPostfix("4 * 6 + 5 *  3 ^ 2")));
        System.out.println(OperationConverter.infixToPostfix("4 + 6 * 5 ^ 3 - 2"));
        System.out.println(OperationConverter.calculatePostfix(OperationConverter.infixToPostfix("4 + 6 * 5 ^ 3 - 2")));
        System.out.println(OperationConverter.infixToPostfix("(4 + (6 + 5 * 7 ^ 8 + 2)) * 9 + 3"));
        System.out.println(OperationConverter.calculatePostfix(OperationConverter.infixToPostfix("(4 + (6 + 5 * 7 ^ 8 + 2)) * 9 + 3")));
    }
}
