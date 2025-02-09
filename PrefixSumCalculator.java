/* You work as a software engineer for a company that manages online retail stores. The company wants to implement a feature that provides real-time insights into daily sales trends. One of the key metrics is the cumulative sales amount up to a specific hour of the day.
The goal is to compute the prefix sum of the sales array, where each element in the array represents the sales amount at a specific hour. The prefix sum at any given hour is the total sales amount from the start of the day up to that hour.
Input:An array Sales[] of n integers representing the sales amount at each hour of the day.
Output:An array PrefixSum[] of n integers where PrefixSum[i] is the cumulative sales amount from the start of the day up to hour i.*/
import java.util.Arrays;
public class PrefixSumCalculator
{
    public static void main(String[] args)
    {
        int[] sales = {100, 150, 200, 50, 250};
        int[] prefixSum = new int[sales.length];
        System.out.println("Sales: "+Arrays.toString(sales));
        if (sales.length > 0)
        {
            prefixSum[0] = sales[0];
            for (int i = 1; i < sales.length; i++)
            {
                prefixSum[i] = prefixSum[i - 1] + sales[i];
            }
        }
        System.out.println("PrefixSum: " +Arrays.toString(prefixSum));
    }
}