import java.util.ArrayList;

class Codechef {

    public static void main(String[] args) {
        
        int Week1=28, Week2=30, Week3=27;
        ArrayList<Integer> attendanceList = new ArrayList<>();

        // Step 2: Add attendance for 3 weeks

attendanceList.add(28);
attendanceList.add(30);
attendanceList.add(27);


        // Step 3: Access and print attendance using .get() method
System.out.println("Attendance in Week 1:"+ attendanceList.get(0));
System.out.println("Attendance in Week 2:"+ attendanceList.get(2));

    }
}