import java.util.*;

class OddRooms {
    public static void main(String[] args) {
    //Your code goes here  
      Scanner scanner = new Scanner(System.in);
      
      int n= scanner.nextInt();
      
      for(int i=0;i<n;i++){
          int room=scanner.nextInt();
          
          
          if (room % 2 !=0){
              
              
              System.out.println(room + " ");
          }      }
       
       scanner.close();
    }
}