public class ReverseNumber {
    public static int reverse(int x) {

        int sign=(x>0)?1:-1;// Checking if number is +ve or -ve
        x=sign*x;// abs value of x
        int result=0;
        while(x>0)
        {
            //Edge condition where at last iteration
            //remaining digits of MAX_VALUE: i.e. Integer.MAX_VALUE / 10 if less than current result then Out of Bound for integer
            //OR
            //Last digit after considering current iteration value x i.e. (Integer.MAX_VALUE-x)%10
            // is less than result*10 (possible value)
            if (Integer.MAX_VALUE / 10 < result || (Integer.MAX_VALUE - x % 10) < result * 10) {
                //edge case or out of bound so returned 0
                return 0;
            }
            //adding digits to result
            result=result*10+x%10;
            //removing digits from x
            x=x/10;
        }
        //with sign result
        return result*sign;
    }

    public static void main(String[] args) {
        int ma=Integer.MAX_VALUE/10;
        System.out.println(ma);
        System.out.println(Integer.MAX_VALUE);
//2147483647
        //214748364
    }
}
