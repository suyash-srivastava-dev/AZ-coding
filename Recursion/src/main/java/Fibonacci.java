import java.util.Arrays;

public class Fibonacci {

    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n)
    {
        //Your code here
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
        {
            if(i==1 || i==0)
            {
                arr[i]=1;
            }
            else
                arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;

    }
    public static long fibonacciWithRecursion(long n)
    {
        if(n==1 || n==0)
            return 1;
        else
            return fibonacciWithRecursion(n-1)+fibonacciWithRecursion(n-2);
    }
    public static void main(String[] args) {
//        Arrays.stream(printFibb(10)).forEach(i-> System.out.print(i+" "));
        System.out.println(fibonacciWithRecursion(9));
    }
}