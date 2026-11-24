import java.util.ArrayList;
import java.util.List;

class Codechef {
    public static final int ARRAY_SIZE = 9;
    public static final int NUM_SEGMENTS = 3;
    
    // Object for synchronization
    private static final Object lock = new Object();

    // Function to calculate the sum of a segment
    static void calculateSegmentSum(List<Integer> array, int segmentId, int[] segmentSum) {
        int start =segmentId * 3;
        int end = start + 3;
        int sum = 0;
        for (int i = start; i < end; i++){
            sum += array.get(i);
        }
        segmentSum[segmentId]=sum;
        
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 9 ; ++i) {
            array.add(i);
        }

        // Threads list stores all the threads
        List<Thread> threads = new ArrayList<>();

        // SegmentSums array stores the sum of each segment
        int[] segmentSums = new int[NUM_SEGMENTS];

        // Create threads to calculate segment sums
        for (int i = 0; i < NUM_SEGMENTS; ++i) {
            final int segmentId = i;
            threads.add(new Thread(() -> calculateSegmentSum(array, segmentId, segmentSums)));
        }

        // Start all threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Calculate the total sum by combining segment sums
        int totalSum = 0;
        for (int segmentSum : segmentSums) {
            totalSum += segmentSum;
        }

        // Display individual segment sums and the total sum
        for (int i = 0; i < NUM_SEGMENTS; ++i) {
            System.out.println("Segment " + i + " Sum: " + segmentSums[i]);
        }
        System.out.println("Total Sum: " + totalSum);
    }
}
