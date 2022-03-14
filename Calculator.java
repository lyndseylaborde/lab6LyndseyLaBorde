import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        double firstOperand = scanner.nextDouble(); //User enters first number
        System.out.print("Enter second operand: ");
        double secondOperand = scanner.nextDouble(); //User enters second number
        System.out.println(); //skip a line

// Calculator menu
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println(); //skip a line to match output in instructions
        System.out.print("Which operation do you want to perform? ");
        int operationType = scanner.nextInt(); //User inputs number 1-4 based on which calculation they want
        System.out.println(); //skip a line to match output in instructions

//If statement to determine which calculation to perform and which output to display
        if (operationType == 1) {
            System.out.print("The result of the operation is " + (firstOperand + secondOperand) + ". Goodbye!");
        } else if (operationType == 2) {
            System.out.print("The result of the operation is " + (firstOperand - secondOperand) + ". Goodbye!");
        } else if (operationType == 3) {
            System.out.print("The result of the operation is " + firstOperand * secondOperand + ". Goodbye!");
        } else if (operationType == 4) {
            System.out.print("The result of the operation is " + firstOperand / secondOperand + ". Goodbye!");
        } else {
            System.out.print("Error: Invalid selection! Terminating program.");
        }

    }
}
