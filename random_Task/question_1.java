// Given an integer, n, perform the following conditional actions:
// • If n is odd, print Weird
// • If n is even and in the inclusive range of 2 to 5, print Not Weird
// • If n is even and in the inclusive range of 6 to 20, print Weird
// • If n is even and greater than 20, print Not Weird  

package random_Task;

import java.util.Scanner;

public class question_1 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
                System.out.println("Enter N value");

         int n=s.nextInt();

    if(n%2==1){
        System.out.println("Weird");
    };
if(n%2==0&&n==4){
        System.out.println("Not Weird");
 
}
if(n%2==0&&(n>6&&n<20)){
        System.out.println("Weird");
 
}
if(n%2==0&&n>20){
        System.out.println("Weird");
 
}

    }
   
    
}
