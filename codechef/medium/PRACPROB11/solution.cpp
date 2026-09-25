import java.util.Scanner;
import java.util.Arrays; // For sorting the array

class LargestScoreGap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("0");
            scanner.close();
            return; 
        }

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        Arrays.sort(scores);

        int maxGap = 0;

        // --- START OF MISSING CODE ---
       
       for(int i=1;i< scores.length;i++){
           int gap =scores[i] - scores[i -1];
           
           if(gap > maxGap) {
               maxGap =gap;
               
           }
       }
       
       
       
       
       

        // --- END OF MISSING CODE ---

        System.out.println(maxGap);
        scanner.close();
    }
}