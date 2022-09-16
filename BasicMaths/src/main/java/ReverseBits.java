public class ReverseBits {
    public static void leftRightBitwiseShift()
    {
        int a=3;//00011
        int b=3;//00011
        int n=1;//00001
        System.out.println("a:"+Integer.toBinaryString(a));//11
        a=a<<n;//bitwise left shift
        System.out.println("a:"+Integer.toBinaryString(a));//110

        System.out.println("b:"+Integer.toBinaryString(b));//11
        b=b>>n;//bitwise right shift
        System.out.println("b:"+Integer.toBinaryString(b));//1
    }
    public static void bitwiseOperations()
    {
        int a=3;
        int b=2;
        System.out.println("a:"+Integer.toBinaryString(a));//11
        a=a&1;//bitwise AND
        /**
         * 11
         * 01
         * --
         * 01
         */
        System.out.println("a:"+Integer.toBinaryString(a));
        System.out.println("b:"+Integer.toBinaryString(b));//10
        b=b&1;//bitwise AND
        /**
         * 10
         * 01
         * --
         * 00
         */
        System.out.println("b:"+Integer.toBinaryString(b));//0
    }

    public static void reverseBits()
    {
        //Number to reverse
        int N=5;
        System.out.println("N :"+Integer.toBinaryString(N));
        //constructing final result
        int result=0;
        //considering 5 bits
        for(int i=0;i<5;i++)
        {
            //Moving to next bit in result(from right to left)
            //shifting result to left by one bit
            result=result<<1;
            //Bitwise AND with N (checking last bit is 1 or zero)
            if((N&1)==1)
            {
                //if last bit is 1 then add that to result
                result++;
            }
            //Moving to next bit in N(from left to right)
            //Bitwise right shift
            N=N>>1;
        }
        System.out.println("Result:"+Integer.toBinaryString(result));
    }
    public static void main(String[] args) {
//        leftRightBitwiseShift();
//        bitwiseOperations();
        reverseBits();
    }
}
