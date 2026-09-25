import java.util.Scanner;

class ScoreCorrector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // --- START OF INCOMPLETE CODE ---
        for (int i = 0; i < scores.length; i++) {
            // Your code to check and replace negative scores goes here
            
            
            
            
        }
        // --- END OF INCOMPLETE CODE ---

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        scanner.close();
    }
}