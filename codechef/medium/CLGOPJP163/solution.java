class Codechef {
    // A static variable
    static int staticVar;

    // A static block
    static {
        System.out.println("This is a static block.");
        staticVar = 42;
    }

    public static void main(String[] args) {
        System.out.println("Static variable: " + staticVar);
    }
}