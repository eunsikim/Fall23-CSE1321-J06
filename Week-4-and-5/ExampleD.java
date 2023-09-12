//  Nesting If Statements
//  Write a program that takes an integer as input, then
//  output if the number is negative, postive, or zero.

import java.util.Scanner;

public class ExampleD {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        //  Example without nesting
        System.out.println("[Example with nesting]");
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number < 0){
            System.out.println(number + " is negative.");
        }
        else if(number > 0){
            System.out.println(number + " is positive.");
        }
        else{
            System.out.println(number + " is zero.");
        }
        System.out.println();


        
        //  Example with nesting in the IF statement
        System.out.println("[Example with nesting in the IF statement]");
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number != 0){
            if(number > 0){
                System.out.println(number + " is positive.");
            }
            else{
                System.out.println(number + " is negative.");
            }
        }
        else{
            System.out.println(number + " is zero.");
        }

        System.out.println();



        //  Example with nesting in the ELSE statement
        System.out.println("[Example with nesting in the ELSE statement]");
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number > 0){
            System.out.println(number + " is positive.");
        }
        else{
            if(number < 0){
                System.out.println(number + " is negative.");
            }
            else{
                System.out.println(number + " is zero.");
            }
        }

        System.out.println();
    }
}
