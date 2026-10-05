class MathUtils {
    // A static method to calculate the square of an integer
    public static int square(int num) {
        return num * num;
    }
    
    // Another static method to calculate the factorial of an integer
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

class Codechef {
    public static void main(String[] args) {
        // Call the static methods directly using the class name
        int squaredValue = MathUtils.square(5);
        System.out.println("Square of 5 is: " + squaredValue);

        int factorialValue = MathUtils.factorial(5);
        System.out.println("Factorial of 5 is: " + factorialValue);
    }
}
