package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

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
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n");
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

                case 2:
                    System.out.println("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.sub(num1, num2) + "\n");
                    break;

                case 3:
                    System.out.println("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.mul(num1, num2) + "\n");
                    break;

                case 4:
                    System.out.println("Enter number 1: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Enter number 2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.div(num1, num2) + "\n");
                    break;

                case 5:
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.sqroot(num1) + "\n");
                    break;

                default:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    return;
            }

        } while (true);
    }

    public double add (double num1, double num2) {
        logger.info("[ADDITION] - " + num2 + " TO " + num1);
        double result = num1 + num2;
        logger.info("[RESULT - ADDITION] - " + result);
        return result;
    }

    public double sub (double num1, double num2) {
        logger.info("[SUBTRACTION] - " + num2 + " FROM " + num1);
        double result = num1 - num2;
        logger.info("[RESULT - SUBTRACTION] - " + result);
        return result;
    }

    public double mul (double num1, double num2) {
        logger.info("[MULTIPLICATION] - " + num2 + " TO " + num1);
        double result = num1 * num2;
        logger.info("[RESULT - MULTIPLICATION] - " + result);
        return result;
    }

    public double div (double num1, double num2) {
        logger.info("[DIVISION] - " + num2 + " BY " + num1);
        if (num2 == 0) {
            double result = Integer.MIN_VALUE;
            logger.info("[RESULT - DIVISION] - ERROR: DIVISION BY ZERO");
        }
        double result = num1 / num2;
        logger.info("[RESULT - DIVISION] - " + result);
        return result;
    }

    public double sqroot (double num1) {
        logger.info("[SQUARE ROOT] - " + num1);
        double result = Math.sqrt(num1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }
}

