class student{
    private String name;
    private float gpa;

    // Default Constructor
    public student(){
        name = "John";
        gpa = 4;
    }

    // Overloaded Constructor
    public student(String name, float _gpa){
        this.name = name;
        gpa = _gpa;
    }

    // We do not need to make functions static in non-Main/Driver classes for now
    public void setName(String name){
        this.name = name;
    }
    public String getName(String password){
        if(password.equals("123")){
            return name;
        }
        else{
            return "";  
        }
    }
}

public class ExampleA {
    // We will only use static for functions in the Main/Driver Class (for now)
    public static void something(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("Eun Sik", 2);

        System.out.println(s1.getName("123"));
        System.out.println(s2.getName("asd"));
    }
}
