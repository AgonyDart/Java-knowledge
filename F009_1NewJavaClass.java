package UploadToGithub;

public class F009_1NewJavaClass {
//      we can use a PUBLIC java class to create objects, for this example I'll create a person template nevertheless the name of our class is 'F009_1NewJavaClass'
    String name;
    String surname;
    String occupation;
    int age;
    
    public void PrintData(){
        System.out.println("\nname = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
        System.out.println("occupation = " + occupation);
    }
}