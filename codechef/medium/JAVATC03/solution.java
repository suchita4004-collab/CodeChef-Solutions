import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        
        try{
            if (b == 0){
                throw new
                ArithmeticException();
                
            }   
            
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Division not allowed.");
        }
        sc.close();
        // Write your code here
    }
}