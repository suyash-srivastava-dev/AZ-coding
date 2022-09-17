/**
 * Input:
 * N=7
 * Output:
 * 784
 * Explanation:
 * 13+23+33+43+53+63+73=784
 */
public class SumOfFirstNTerms {

    static long sumOfSeries(long n) {
        // code here
        /**
         //With Recursion : O(N)

         if(n==1)
         return 1;
         else
         {
             return (long)Math.pow(n,3)+sumOfSeries(--n);
         }
         */
        /**
         * With Formula O(1)
         */
        return (n*(n+1)/2)*(n*(n+1)/2);
    }

    public static void main(String[] args) {
        System.out.println(sumOfSeries(7));
    }
}