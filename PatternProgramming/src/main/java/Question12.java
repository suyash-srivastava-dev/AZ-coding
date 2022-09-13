/**

 1
 2 3
 4 5 6
 7 8 9 10

 */
public class Question12 {
    public static void main(String[] args) {
        int n=5;
        int m=0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(++m);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
