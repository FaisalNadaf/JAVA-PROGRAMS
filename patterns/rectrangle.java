package patterns;

import java.util.Scanner;

public class rectrangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int L = scan.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int B = scan.nextInt();

        for (int i = 1; i <= L; i++) {

            for (int j = 1; j <= B; j++) {
                if (i == 1 || i == L || j == 1 || j == B) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
