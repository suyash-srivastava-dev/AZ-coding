
/**
     *
    ***
   *****
  *******
 *********
 *********
  *******
   *****
    ***
     *


 */

public class Question8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            for(int j=i;j>1;j--)
            {
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            //spaces print left side of inverted triangle
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            //Stars print left side of inverted triangle
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            //Stars print right side of inverted triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
