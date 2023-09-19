/*
 * In this simple program, we are going to simulate a car.
 * We will only define 2 attributes, the engine status (ON/OFF)
 * and the percentage of gas in the tank.
 * 
 * To simluate the car, we implement a while loop that should 
 * decrease the tank by 5% per each iteration.
 * 
 * Moreover, the loop should only run if the engine is on and the tank
 * is either empty or has some gas left.
 */

public class ExampleB {
    public static void main(String[] args) {
        boolean engine = true;
        float tank = 1.0f;
        int count = 1;

        // Are there any errors or bugs in our program?
        while(engine && tank >= 0){
            if(tank > 0){
                System.out.println("Iteration #" + (count++) + " & Tank : " + (tank * 100) + "%");
                tank -= 0.05;           }
            else{
                engine = false;
                System.out.println("Tank is empty");
            }
        }
    }
}
