package basic_calculator;

import java.util.*;

public class basic_calculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // scan is variable
        System.out.print("Enter a = ");
        int a = scan.nextInt();
        System.out.print("Enter b = ");

        int b = scan.nextInt();
        System.out.print("Enter operator = ");
        char operator = scan.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.println(a + b);

                break;
            case '-':
                System.out.println(a - b);

                break;
            case '/':
                System.out.println(a / b);

                break;
            case '*':
                System.out.println(a * b);

                break;
            case '%':
                System.out.println(a % b);

                break;

            default:
                System.out.println("invalid operator");

                break;
        }

    }

}