import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the ArrayList
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(48);
        marks.add(70);
        marks.add(86);

        // Step 2: Update each element manually (split get and set)
for (int i=0; i < marks.size();i++ )
{
    marks.set(i,marks.get(i) + 2);
}










        // Step 3: Print updated elements manually
        System.out.println("Updated Marks:");
        System.out.println(marks.get(0));
        System.out.println(marks.get(1));
        System.out.println(marks.get(2));
    }
}
