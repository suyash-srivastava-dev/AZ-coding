/**
 *  LINK: https://practice.geeksforgeeks.org/problems/count-digits5716/1
 *  DIFFICULTY: School
 */
public class CountDigits {

//User function Template for Java
    static int evenlyDivides(int N){
            int number=N;
            int count=0;
            while(N>0)
            {
                int r=N%10;
                N=N/10;

                if(r!=0 && number%r==0)
                    count++;
            }
            // System.out.println(count);
            return count;
        }

}
