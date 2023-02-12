import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        operator = reader.next().charAt(0);
        switch(operator) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is the following:\n");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + result + "\n");
    }
}
