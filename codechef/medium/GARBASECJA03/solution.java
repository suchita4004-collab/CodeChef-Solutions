class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul");

        s1 = null; // Object becomes eligible for Garbage Collection

        System.gc(); // Request Garbage Collection

        System.out.println("Garbage Collection requested");
    }
}