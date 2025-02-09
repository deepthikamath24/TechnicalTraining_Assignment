
/*You are working for an e-commerce company that deals with a large volume of customer orders. The company wants to optimize its warehouse operations by analyzing the efficiency of order processing.
The goal is to count the number of inversion pairs in the order processing times to identify potential inefficiencies. An inversion pair in this context is defined as a situation where a later order (in terms of processing sequence) took less time to process than an earlier order. By identifying these inversions, you can pinpoint areas where the warehouse team may need to improve their workflow or processes.
Input:An array P[] of n integers representing the processing times of orders, in the order they were processed.
Output:The count of inversion pairs in the array.*/
public class InversionCounter {
    public static void main(String[] args) {
        int[] arr = {1, 9, 6, 4, 5};
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("The inversion count is : " + count); 
    }
}