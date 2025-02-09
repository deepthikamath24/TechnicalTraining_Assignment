public class HighestSales {

    public static void main(String[] args) {
        
        int[] sales = {120, 340, 560, 230, 890, 675, 300};
        
        int maxSales = sales[0];
        int day = 0;
        
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                day = i;
            }
        }
        
        System.out.println("The highest sales were on day " + (day + 1) + " with sales of " + maxSales);
    }
}

