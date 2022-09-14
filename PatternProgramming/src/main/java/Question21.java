/**

 5 5 5 5 5 5 5 5 5
 5 4 4 4 4 4 4 4 5
 5 4 3 3 3 3 3 4 5
 5 4 3 2 2 2 3 4 5
 5 4 3 2 1 2 3 4 5
 5 4 3 2 2 2 3 4 5
 5 4 3 3 3 3 3 4 5
 5 4 4 4 4 4 4 4 5
 5 5 5 5 5 5 5 5 5

 */
public class Question21 {
    public static void main(String[] args) {
        int n=5;
        //2nd Quadrant
        for(int i=1;i<=n;i++)
        {
            int p=n;
            for(int j=1;j<i;j++)
            {
                System.out.print(p--+" ");
            }
            for(int j=i;j<2*n-i;j++)
            {
                System.out.print(p+" ");

            }
            for(int j=2*n-i;j<2*n;j++)
            {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            int p=n;
            for(int j=1;j<i;j++)
            {
                System.out.print(p--+" ");
            }
            for(int j=i;j<2*n-i;j++)
            {
                System.out.print(p+" ");

            }
            for(int j=2*n-i;j<2*n;j++)
            {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }
}
