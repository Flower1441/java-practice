import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first number:");
        double num1 = scanner.nextDouble();
        char op;
        while (true) {
            System.out.println("please enter the operation:");
            op = scanner.next().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                break;
            } else {
                System.out.println("error entering please enter the right operation again");
            }

        }
        double num2;
        while (true) {
            System.out.println("please enter the second number:");
            num2 = scanner.nextDouble();
            if (op == '/' && num2 == 0) {
                System.out.println("the divisor cannot be zero");
                continue;
            } else {
                break;
            }


        }
        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
        scanner.close();
    }
}
