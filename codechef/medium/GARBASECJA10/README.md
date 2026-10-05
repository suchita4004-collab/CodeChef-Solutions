# GARBASECJA10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ

What happens in the following code?

```
Product product = new Product("Laptop", 55000);

product = new Product("Mobile", 25000);

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:59:53.840Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/GARBASECJA10)