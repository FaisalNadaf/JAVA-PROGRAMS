package patterns;

import java.util.Scanner;

public class half_Pyramids {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // scan is variable
        System.out.print("Enter number or rows = ");
        int a = scan.nextInt();

        for (int i = 0; i <= a-1; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print('*');

            }
            System.out.println();
        }
    }
}
