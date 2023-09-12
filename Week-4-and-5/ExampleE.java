/*  Example of the java Scanner "skipping" Issue
    
    Whenever you write something in the terminal and then press ENTER
    to input it into the program, it enters the characters you typed
    but also a new line or "\n". 
    
    Your computer detects the ENTER key as a new line. Hence, the 
    next print statements appears below our input.

    scanner.nextInt() (or any .next**() except .nextLine()) will read 
    in the input value up to the "\n", leaving it in the input buffer.

    On the other hand, scanner.nextLine() takes the whole input up to
    the \n character, then removes it.

    Whenever we left a \n in the input buffer, the nextLine() will get
    "skipped" since, as mentioned, nextLine() will read in the input
    until it finds the \n.

    To easiest way to solve this is by placing a nextLine() before the
    actual input.
*/

import java.util.Scanner;

public class ExampleE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        String word;

        System.out.print("Enter a number: ");
        number = sc.nextInt();
        System.out.print("Enter a word: ");
        word = sc.nextLine();



        System.out.println("\n\nOh no, our nextLine() got skipped.\n\nTry again\n\n");



        System.out.print("Enter a number: ");
        number = sc.nextInt();

        sc.nextLine(); //   "Flush" the input buffer by adding a nextLine()
        System.out.print("Enter a word: ");
        word = sc.nextLine();

        System.out.println("\n\nYou've entered the number: " + number + " and the word: " + word);
    }
}
