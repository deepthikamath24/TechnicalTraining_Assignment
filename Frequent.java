public class Frequent {
    public static void main(String[] args) {
        double[] max_sales = {9.6, 10.6, 9.6, 4.6, 9.6, 10.6};
        int count1 = 0; 
        int count2 = 0; 
        double mostFrequent = 0; 
        for (int i = 0; i < max_sales.length; i++) {
            count1 = 0; 
            for (int j = 0; j < max_sales.length; j++) {
                if (max_sales[i] == max_sales[j]) { 
                    count1++; 
                }
            }
            if (count1 > count2) {
                count2 = count1;
                mostFrequent = max_sales[i];
            }
        }
        System.out.println("Most Frequent Value: " + mostFrequent);
        System.out.println("Frequency: " + count2);
    }
}
 
