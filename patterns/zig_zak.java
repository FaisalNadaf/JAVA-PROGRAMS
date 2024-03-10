package patterns;

import java.util.*;

public class zig_zak {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // scan is variable
        System.out.print("Enter number or rows = ");
        int a = scan.nextInt();

        for (int i = 0; i <= a; i++) {

            for (int j = 0; j <= i; j++) {

                if (j == i - 1) {
                    System.out.print(j);
                }
                    if (j == 2) {
                        continue;
                    }
                
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
