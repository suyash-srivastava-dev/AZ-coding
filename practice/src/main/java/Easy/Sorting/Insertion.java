package Easy.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void insertionSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        insertionSort(arr,arr.length);
        Arrays.stream(arr).forEach(i->System.out.print(i+" "));
    }
}
