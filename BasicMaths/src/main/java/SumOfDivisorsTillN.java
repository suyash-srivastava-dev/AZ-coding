/**
 * Input:
 * N = 4
 * Output:
 * 15
 * Explanation:
 * F(1) = 1
 * F(2) = 1 + 2 = 3
 * F(3) = 1 + 3 = 4
 * F(4) = 1 + 2 + 4 = 7
 * ans = F(1) + F(2) + F(3) + F(4)
 *     = 1 + 3 + 4 + 7
 *     = 15
 */
public class SumOfDivisorsTillN {
    static long sumOfDivisors(int N){
        // code here
        long sumTotal=0;
        for(int i=1;i<=N;i++)
        {
            //Number of times that nummber would show up in N i.e. N/i
            //Number of times * Value of that number = Sum of all that Number present in F(i)
            sumTotal+=(N/i)*i;

        }
        return sumTotal;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDivisors(4));
    }
}
