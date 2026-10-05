class MyClass {
    private int myField;

    // Getter method for myField
    public int getMyField() {
        return myField;
    }

    // Setter method for myField
    public void setMyField(int value) {
        myField = value;
    }
}

class Codechef {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Using the setter method to set the value of myField
        obj.setMyField(42);

        // Using the getter method to retrieve the value of myField
        int value = obj.getMyField();
        System.out.println("Value of myField: " + value);
    }
}
