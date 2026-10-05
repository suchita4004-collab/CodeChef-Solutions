import java.util.Scanner;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstTitle = sc.nextLine();
        String secondTitle = sc.nextLine();

        Book book = new Book(firstTitle);

        System.out.println("Book: " + book.title);

        book = null;

        System.gc();
        
        book =new Book(secondTitle);
        System.out.println("Book: " + book.title);


        System.out.println("Garbage Collection requested");

        sc.close();
    }
}