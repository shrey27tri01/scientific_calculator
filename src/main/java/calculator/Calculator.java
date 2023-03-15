package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private static double num1, num2;

    public Calculator() {

    }

    public Calculator (double n) {
        num1 = n;
    }

    public Calculator(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator");

        do {
            int choice;
            System.out.println("Enter your choice");
            System.out.print("1. Addition\n" +
                    "2. Subtraction\n");
            System.out.print("Choice: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            System.out.println("\n");

            switch (choice) {
                case 1:
                    System.out.println("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.add(num1, num2) + "\n");
                    break;


                default:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    return;
            }

        } while (true);
    }

    public double add (double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
}

