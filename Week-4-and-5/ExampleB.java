import java.util.Scanner;

public class ExampleB {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if(age >= 21){
            System.out.println("You can rent a car");
        }
        else if(age >= 18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot rent a car nor vote");
        }
    }
}
