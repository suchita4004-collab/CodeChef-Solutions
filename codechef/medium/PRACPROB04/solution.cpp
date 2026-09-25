import java.util.Scanner;

class SentenceWordReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String reversedSentence = "";

        // --- START OF YOUR CODE ---
       
       
      for (int i=words.length -1;i>=0;i--){
          reversedSentence += words[i];
          if(i>0){
          reversedSentence += " ";
          }
      } 
       
       
       

        // --- END OF YOUR CODE ---

        System.out.println(reversedSentence.trim());
        scanner.close();
    }
}