import java.util.Scanner;
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0;i < T; i++){
            
            String name= sc.nextLine();
            Student student = new Student(name);
        
        System.out.println("Student: " + student.name);

        student = null;

        System.gc();

        System.out.println("Garbage Collection requested");
        }
    }
}