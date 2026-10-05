class OuterClass {
    // Static nested class
    public static class StaticNestedClass {
        
        // Static nested class can have its own fields and methods
        private int nestedField = 20;
        
        // Constructor for the static nested class
        public StaticNestedClass() {
            // Empty constructor
        }
        
        // Method in the static nested class
        public void display() {
            System.out.println("Value of nestedField: " + nestedField);
        }
    }
}


class Codechef {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        
        // Access the nested class's method and field
        nestedObj.display();
    }
}