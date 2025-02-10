/*You are working for an e-commerce company that deals with a large volume of customer orders. The company wants to optimize its warehouse operations by analyzing the efficiency of order processing.
Objective: Count the number of inversion pairs in the order processing times to identify potential inefficiencies. An inversion pair in this context is defined as a situation where a later order (in terms of processing sequence) took less time to process than an earlier order. By identifying these inversions, you can pinpoint areas where the warehouse team may need to improve their workflow or processes.
Input: An array P[] of n integers representing the processing times of orders, in the order they were processed.
Output: The count of inversion pairs in the array.
Input:P[] = [30, 45, 25, 60, 20]
Output:The inversion count is 6*/

public class Inversion {

    public static int countInversions(int[] P) {
        int count = 0;
        int n = P.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (P[i] > P[j]) { 
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] P = {30, 45, 25, 60, 20};
        System.out.println("The inversion count is: " + countInversions(P));
    }
}
