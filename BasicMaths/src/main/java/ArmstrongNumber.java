public class ArmstrongNumber {

         public static String armstrongNumber(int n){
            //Saving total to remove cube digits from it, and end result should be 0 for Armstrong Number
            int total=n;
            //Taking out digits
            while(n>0)
            {
                //Removing digit^3 from Total
                total=total-(int)Math.pow(n%10,3);
                //Removing Unit place digit
                n=n/10;
            }
            //Check total to be zero or not
            if(total==0)
                return "Yes";
            else
                return "No";
        }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(371));
        System.out.println(armstrongNumber(372));

    }
}
