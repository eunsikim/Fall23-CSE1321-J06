import java.util.Scanner;

public class ExampleA {
    public static void main(String[] args) {
        float acceleration;
        float force;
        float mass;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Force: ");
        force = sc.nextFloat();

        System.out.print("Enter Mass: ");
        mass = sc.nextFloat();

        acceleration = force / mass;

        System.out.println("The Acceleration is: " + acceleration);
    }
}
