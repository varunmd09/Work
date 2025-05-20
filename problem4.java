
//Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
//        (examples)
//input: [1,2,8,9,12,46,76,82,15,20,30]
//Output:
//        {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}


public class problem4 {
    public static void main(String[] args) {
        int[] numbers={1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] divisors={1,2,3,4,5,6,7,8,9};
        int[] counts=new int[divisors.length];
        for (int i = 0; i < divisors.length; i++) {
            int divisor = divisors[i];
            int count = 0;
            for (int num : numbers) {
                if (num % divisor == 0) {
                    count++;
                }
            }
            counts[i] = count;
        }
        System.out.print("{");
        for (int i = 0; i < divisors.length; i++) {
            System.out.print(divisors[i] + ": " + counts[i]);
            if (i < divisors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

    }



}
