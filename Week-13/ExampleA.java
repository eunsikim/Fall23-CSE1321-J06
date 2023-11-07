class student{
    String name;
    float gpa;

    // We do not need to make functions static in non-Main/Driver classes for now
    public void setName(String _name){
        name = _name;
    }
    public String getName(){
        return name;
    }
}

public class ExampleA {
    // We will only use static for functions in the Main/Driver Class (for now)
    public static void something(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        student s1 = new student();
        int number = 3;
        int[] numbers = new int[3];

        s1.setName("Eun Sik");

        student s2 = new student();

        s2.name = "John";

        System.out.println(s1.getName());
        System.out.println(s2.name);
    }
}
