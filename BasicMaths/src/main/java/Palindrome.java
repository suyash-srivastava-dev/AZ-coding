import java.util.ArrayList;

public class Palindrome {
    public static String is_palindrome(int n)
    {
        //ArrayList for storing digits of n
        ArrayList<Integer> al=new ArrayList<>();
        //Getting digits till >0
        while(n>0)
        {
            //adding unit place to ArrayList
            al.add(n%10);
            //Removing last digit
            n=n/10;
        }
        //iterating over ArrayList
        for(int i=0;i<al.size()/2;i++)
        {
            //Checking first and last pointer having different values
            if(al.get(i)!=al.get(al.size()-1-i))
                return "No";
        }
        //completed initial check so should be palindrome
        return "Yes";
    }

    public static void main(String[] args) {
        System.out.println(is_palindrome(12134321));
    }
}
