import java.util.Scanner;

class LongWordCount {

    public static void main(String[] args) {
    // Your code goes here   
       Scanner scanner =new Scanner(System.in);
       String sentence = scanner.nextLine();
       String[] words =sentence.split(" ");
       
       int count=0;
       
       for (int i=0;i < words.length;i++){
           if (words[i].length() >=6) {
               count ++;
           }
       }
       System.out.println(count);
       
       scanner.close();
       
       
    }
}