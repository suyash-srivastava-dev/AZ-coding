/**

 *        *
 **      **
 ***    ***
 ****  ****
 ********** <--------output
 ****  ****
 ***    ***
 **      **
 *        *

 */

public class Question19 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            //First list of *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //Space list of " "
            for(int j=2*(n-i);j>=1;j--)
            {
                System.out.print(" ");
            }
            //Second list of *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Reversing the i value iterations
        for(int i=n-1;i>=1;i--)
        {
            //First list of *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //Space list of " "
            for(int j=2*(n-i);j>=1;j--)
            {
                System.out.print(" ");
            }
            //Second list of *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
