//Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
//
//Output: (examples)
//        1) input a = 1, then output : 1
//        2) input a = 2, then output : 1, 3
//        3) input a = 3, then output : 1, 3, 5
//        4) input a = 4, then output : 1, 3, 5, 7

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter the input Value: ");
            int a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                int num = 2 * i + 1;
                System.out.print(num);
                if (i < a - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
            System.out.print("Enter another value?(Y/N): ");
            choice = sc.next().charAt(0);
        }while (choice=='Y');
    }
}
