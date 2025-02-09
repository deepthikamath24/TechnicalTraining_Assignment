/*You are a data analyst for a logistics company that tracks the fuel consumption of delivery vehicles throughout their routes. The company wants to optimize fuel usage by analyzing the remaining fuel capacity after each delivery point.
The goal is to compute the postfix sum of the fuel consumption array, where each element in the array represents the fuel consumed at a specific delivery point. The postfix sum at any given point is the total fuel consumption from that point to the end of the route.
Input:An array Fuel[] of m integers representing the fuel consumed at each delivery point.
Output:An array PostfixSum[] of m integers where PostfixSum[i] is the total fuel consumption from delivery point i to the end of the route.*/
import java.util.Arrays;
public class Postfix
{
    public static void main(String[] args)
    {
        int[] fuel = {5, 10, 3, 7, 8};
        int[] postfixSum = new int[fuel.length];
        System.out.println("fuel: "+Arrays.toString(fuel));
        if (fuel.length > 0)
        {
            postfixSum[fuel.length-1] = fuel[fuel.length-1];
            for (int i = fuel.length-2; i >=0; i--)
            {
                postfixSum[i] = fuel[i] + postfixSum[i+1];
            }
        }      
        System.out.println("Postfix: " +Arrays.toString(postfixSum));
    }
} 
    

