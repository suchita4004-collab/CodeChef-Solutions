import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of ArrayList as input
        int n = sc.nextInt();

        // Step 2: Declare ArrayList

int[] arr= new int[n];
        // Step 3: Take input and add to ArrayList

for (int i = 0; i < n; i++){
    arr[i]=sc.nextInt();
}

        // Step 4: Update even elements

for (int i = 0; i < n; i++){
    if(arr[i] % 2  == 0) {
        
        arr[i] = arr[i] + 1;
    }
}



        // Step 5: Print the updated list
        System.out.println("Updated Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }

        sc.close(); // Close the scanner
    }
}
