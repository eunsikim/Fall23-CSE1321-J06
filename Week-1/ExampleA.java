import java.util.Scanner;

public class ExampleA{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		short age;

		System.out.println("How old are you?: ");
		age = sc.nextShort();

		System.out.println("Your are " + age + " years old.");
	}
}