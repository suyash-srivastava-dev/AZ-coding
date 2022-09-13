/**

 A B C D E
 A B C D
 A B C
 A B
 A

 */
public class Question14 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            char c='A';
            for(int j=n-i+1;j>0;j--)
            {
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
}
