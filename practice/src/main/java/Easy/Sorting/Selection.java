package Easy.Sorting;

import java.util.Arrays;

public class Selection {
    public static void selectionSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        selectionSort(arr,arr.length);
        Arrays.stream(arr).forEach(i->System.out.print(i+" "));
    }
}
