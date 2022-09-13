/**

 A
 A B
 A B C
 A B C D
 A B C D E


 */
public class Question13 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            char c='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
}
