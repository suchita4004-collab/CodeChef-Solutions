import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array as input
  int n =sc.nextInt();
  int[] arr=new int[n];

        // Step 2: Declare array of size n


        // Step 3: Take array input from user
for (int i=0; i< n; i++) {
    arr[i]=sc.nextInt();
}
for(int i=0; i< n; i++){
    if (arr[i] %2 == 0){
    arr[i]= arr[i]+1;
     
     }
   }



        // Step 4: Update even elements






        // Step 5: Print the updated array
        System.out.println("Updated Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }

        sc.close(); // Close the scanner
    }
}
