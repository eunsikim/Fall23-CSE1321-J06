import java.util.Random;

public class ExampleE {
    public static void main(String[] args) {
    
        Random rand = new Random();

        int number = rand.nextInt(5);

        while(true){
            System.out.println(number); // This will generate the same number. Why?
        }

    }
}
