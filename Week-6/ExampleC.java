import java.util.Scanner;

public class ExampleC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice;

        do {
            System.out.print("Do you want to continue (Y/N): ");
            choice = sc.nextLine().charAt(0);
        } 
        while (choice == 'Y');
    }
}
