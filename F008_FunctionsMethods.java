package UploadToGithub;

public class F008_FunctionsMethods {

    public static void main(String[] args) {
        System.out.println("A function is a process that returns a value and can receive parameters\\nA method in Java is so similar to a function but this one is ALWAYS linked to a class.object");
        System.out.print("With a method of 'Math' we are printing a random number whenever you run this code between 0 - 10|: ");
        int randomNumber = (int) (Math.random() * 11);
        System.out.println(randomNumber);
        System.out.print("Now with a function we add one to this number|: " + AddOne(randomNumber) + "\n");
    }

    public static int AddOne(int added) {
        added += 1;
        return added;
    }
}
