package algorithms;

public class QuickSort {
    public static void quicksort(int arr[],int low, int high){
        //if(arr.length==0) return arr;
        int pivot = arr[low];
        low = low+1;
        partition(arr,pivot,low,high);
    }

    private static void partition(int[] arr,int pivot,int low,int high) {
        int i = low;
        int j = high;
        while(i<=j){
            if(arr[i]<=pivot) i++;
            if(arr[j]>pivot) j--;
            if(i<=j){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[j];
        arr[j]=arr[low-1];
        arr[low-1] = temp;
        if(j>low) quicksort(arr,low-1,j-1);
        if(j<high) quicksort(arr,j+1,high);
    }
}
