import java.util.ArrayList;
import java.util.Scanner;

public class FactorialWithLessThanN {

    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> al=new ArrayList<>();
        long fact=1;
        for(long i=1;i<=N;i++)
        {

            if(i*fact <=N)
            {
                fact*=i;
                al.add(fact);
            }
            else
                break;
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        factorialNumbers(6).stream().forEach(i-> System.out.print(i+" "));
    }
}