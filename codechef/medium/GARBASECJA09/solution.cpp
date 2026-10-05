import java.util.Scanner;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = __________;
        int firstPrice = __________;

        String secondName = __________;
        int secondPrice = __________;

        Product product = __________;

        System.out.println("Product: " + __________ + ", Price: " + __________);

        product = __________;

        System.out.println("Product: " + __________ + ", Price: " + __________);

        __________;

        System.out.println("Garbage Collection requested");

        sc.close();
    }
}