/**

 ************
 *****  *****
 ****    ****
 ***      ***
 **        **
 *          *
 *          *
 **        **
 ***      ***
 ****    ****
 *****  *****
 ************

 */
public class Question18 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            //First list of *
            for(int j=n+1-i;j>=1;j--)
            {
                System.out.print("*");
            }
            //Space list of " "
            for(int j=1;j<=2*i;j++)
            {
                System.out.print(" ");
            }
            //Second list of *
            for(int j=n+1-i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Reversing the i value iterations
        for(int i=n;i>=0;i--)
        {
            //First list of *
            for(int j=n+1-i;j>=1;j--)
            {
                System.out.print("*");
            }
            //Space list of " "
            for(int j=1;j<=2*i;j++)
            {
                System.out.print(" ");
            }
            //Second list of *
            for(int j=n+1-i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
