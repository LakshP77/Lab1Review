import java.util.*;

public class InFixCalc {

    public static void main(String[] args) {
        // String input = "4 + 4";
        // String input = "4 + 4 / 2";
        // String input = "1 * -3";
        String input = "1 * -3 + 9 / 3";
        // String input = "5";
        // String input = "-5";
        int answer = calculate(input);
        System.out.println("Answer is " + answer);
    }

    // preconditions: all binary operations are separated via a space
    // postconditions: returns the result of the processed string
    public static int calculate(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Input expression is empty.");
        }

        Scanner scanner = new Scanner(input);
        // read the first number as the initial lhs (handles negatives like -3)
        int lhs = scanner.nextInt();

        // pattern: <op> <rhs> repeated; evaluate as we go, left-to-right
        while (scanner.hasNext()) {
            String opToken = scanner.next();       // "+", "-", "*", or "/"
            char operation = opToken.charAt(0);

            int rhs = scanner.nextInt();           // handles attached sign

            switch (operation) {
                case '+':
                    lhs = lhs + rhs;
                    break;
                case '-':
                    lhs = lhs - rhs;
                    break;
                case '*':
                    lhs = lhs * rhs;
                    break;
                case '/':
                    // integer division as specified; optional zero-check:
                    if (rhs == 0) throw new ArithmeticException("Division by zero.");
                    lhs = lhs / rhs;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + operation);
            }
        }

        scanner.close();
        return lhs;
    }
}
