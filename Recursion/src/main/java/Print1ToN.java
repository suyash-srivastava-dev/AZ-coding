public class Print1ToN {


    public static void printNos(int N)
    {
        if(N<1)
            return;
        else
        {
            int temp=N;
            printNos(--N);
            System.out.print(temp+" ");
        }
    }

    public static void main(String[] args) {
        printNos(10);
    }
}
