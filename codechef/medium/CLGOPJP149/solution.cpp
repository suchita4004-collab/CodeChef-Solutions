import java.util.Scanner;

class Student {
    public String name;
    public int age;

    public void display() {
        System.out.println(name + " " + age);
    }
}

class Codechef {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);

        s.name = scanner.next();
        s.age = scanner.nextInt();

        s.display();

        scanner.close();
    }
}
