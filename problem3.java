
//
//Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
//
//Output: (examples)
//        1) input a = 1, then output : 1
//        2) input a = 2, then output : 1
//        3) input a = 3, then output : 1, 3, 5
//        4) input a = 4, then output : 1, 3, 5
//        5) input a = 5, then output : 1, 3, 5, 7, 9
//        6) input a = 6, then output : 1, 3, 5, 7, 9
//        .
//        .
//        7) input a = x, then output : 1, 3, 5, 7, .....


import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter the input value: ");
            int a = scanner.nextInt();
            if (a >= 0) {
                int count = (a % 2 == 0) ? a - 1 : a;
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    int oddNumber = 2 * i + 1;
                    result.append(oddNumber);
                    if (i < count - 1) {
                        result.append(", ");
                    }
                }
                System.out.println("Output: " + result.toString());
            }
            System.out.print("Enter another value?(Y/N): ");
            choice = scanner.next().charAt(0);
        }while (choice=='Y');

    }
}
