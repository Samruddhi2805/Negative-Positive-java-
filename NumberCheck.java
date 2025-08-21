//Write a Java program to check whether a number is positive, negative, or zero.

import java.util.* ;

public class NumberCheck
  {
    public static void main(String args[]) 
       {
        double number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number= ");
        number=scan.nextDouble();

        if (number>0) 
        {                               // Check the number
        System.out.println("The number is positive.");
        } 
        else if (number<0) 
        {
        System.out.println("The number is negative.");
        } 
        else 
        {
        System.out.println("The number is zero.");
        }
         
    }
}
