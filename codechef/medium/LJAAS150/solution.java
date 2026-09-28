import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code goes here
        Scanner scanner =new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int t =scanner.nextInt();
            while (t-- > 0){
                int num =scanner.nextInt();
                if (isEven(num)){
                    System.out.println("Even");
                }else {
                    System.out.println("Odd");
                }
            }
        }
       scanner.close(); 
    }
    
    public static boolean isEven(int num) {
        // Complete this method 
       return num % 2 ==0; 
    }
}