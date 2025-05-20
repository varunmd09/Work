//Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
//Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
//Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string


import java.util.Scanner;

public class problem1 {

    public static double operation(double a, double b, String select) {
        switch (select) {
            case "Addition":
                return a + b;
            case "Subtraction":
                return a - b;
            case "Multiplication":
                return a * b;
            case "Division":
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return 0;
                } else {
                    return a / b;
                }
            default:
                System.out.println("Invalid operation type");
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a ,b, operation: ");
        String input=scanner.nextLine();
        String[] parts = input.split(" ");

        if (parts.length < 3) {
            System.out.println("Invalid input. Format: <a> <b> <operation>");
            return;
        }
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        String operation = parts[2];
        double result = operation(a, b, operation);
        System.out.println("Result: " + result);


    }
}
