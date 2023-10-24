import java.util.Scanner;


public class ExampleA {
    // Area of a Circle (pi * r^2)
    public static double areaCircle(int r){
        return Math.PI * Math.pow(r, 2);
    }

    // Print a menu selection
    public static void printMenu(){
        System.out.println("Enter 1 ...");
        System.out.println("Enter 2 ...");
        System.out.println("Enter x Exit");
    }

    // Print menu selection and return choice
    public static char getSelection(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 ...");
        System.out.println("Enter 2 ...");
        System.out.println("Enter x Exit");

        char sel = sc.nextLine().charAt(0);

        return sel;
    } 

    public static void main(String[] args) {
        System.out.println(areaCircle(5));

        printMenu();

        while(true){
            char sel = getSelection();

            if(sel == 'x'){
                break;
            }
        }
    }
}
