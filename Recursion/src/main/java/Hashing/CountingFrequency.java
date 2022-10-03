package Hashing;

/**
 * Input:
 * N = 5
 * arr[] = {2, 3, 2, 3, 5}
 * P = 5
 * Output:
 * 0 2 2 0 1
 * Explanation:
 * Counting frequencies of each array element
 * We have:
 * 1 occurring 0 times.
 * 2 occurring 2 times.
 * 3 occurring 2 times.
 * 4 occurring 0 times.
 * 5 occurring 1 time.
 */
public class CountingFrequency {

    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int arrOutput[]=new int [P];
        for(int i=0;i<P;i++)
        {
            arrOutput[i]=0;
        }
        for(int i=0;i<N;i++)
        {
            int arrValue=arr[i];
            arrValue=arrValue-1;//for index
            arrOutput[arrValue]++;
        }
        // Arrays.stream(arrOutput).forEach(i-> System.out.print(i+" "));
        if(P<=N)
        {
            for(int i=0;i<P;i++)
            {
                // System.out.print(i+" ");
                arr[i]=arrOutput[i];
            }
            for(int i=P;i<N;i++)
            {
                arr[i]=0;
            }
        }
        else
        {
            for(int i=0;i<N;i++)
            {
                // System.out.print(i+" ");
                arr[i]=arrOutput[i];
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        frequencyCount( new int[]{2, 2, 3, 3, 5},5,5);
    }
}