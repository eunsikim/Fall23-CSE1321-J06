import java.util.Scanner;

public class ExampleC {
    public static void main(String[] args) {
        float acceleration;
        float force;
        float mass;
        char choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an Option:");
        System.out.println("a - Calulate Acceleration");
        System.out.println("f - Calculate Force");
        System.out.println("m - Calculate Mass");
        System.out.println("Option: ");
        choice = sc.nextLine().charAt(0);

        switch(choice){
            case 'a':
                System.out.print("Enter Force: ");
                force = sc.nextFloat();

                System.out.print("Enter Mass: ");
                mass = sc.nextFloat();

                acceleration = force / mass;

                System.out.println("The Acceleration is: " + acceleration);
                break;
            case 'f':
                System.out.print("Enter Mass: ");
                mass = sc.nextFloat();

                System.out.print("Enter Acceleration: ");
                acceleration = sc.nextFloat();

                force = mass * acceleration;

                System.out.println("The Force is: " + force);
                break;
            case 'm':
                System.out.print("Enter Force: ");
                force = sc.nextFloat();

                System.out.print("Enter Acceleration: ");
                acceleration = sc.nextFloat();

                mass = force / acceleration;

                System.out.println("The Mass is: " + mass);
                break;
            default:
                System.out.println("That is not an option. Bye.");
        }

        
    }
}
