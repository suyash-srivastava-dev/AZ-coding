/**

 E
 D E
 C D E
 B C D E
 A B C D E

 */
public class Question17 {
    public static void main(String[] args) {
        int n=5;
        char c='E';
        for(int i=1;i<=n;i++)
        {
            int j=1;
            for(j=1;j<=i;j++)
            {
                System.out.print(c++ +" ");
            }
            c= (char) (c-j);
            System.out.println();
        }
    }
}
