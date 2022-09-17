import java.util.Arrays;
import java.util.Iterator;

public class lcmAndGcd {
    static Long[] lcmAndGcd(Long A , Long B) {

        // FORMULA: gcd(a, b, c) = gcd(a, gcd(b, c)) for more than two number gcd
        Long o1=A;
        Long o2=B;
        Long rem=0L;
        // eg: A=6,B=7
        while(A%B!=0){
            //6%7=6<==rem//rem=1
            rem=A%B;
            //A=7//A=6
            A=B;
            //B=6//B=1
            B=rem;
        }
        Long gcd=B;
        // FORMULA: LCM= (n1*n2*...nM)/ GCD
        Long lcm=o1*o2/gcd;
        return new Long[]{lcm,gcd};
    }

    public static void main(String[] args) {
        Iterator itr=Arrays.stream(lcmAndGcd(6L,7L)).iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
