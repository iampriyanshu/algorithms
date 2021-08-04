package algorithms;

public class MergeSort {
    public static void mergeSort(int[] arr,int min,int max){
        int mid;
        if(min<max){
            mid = (min+max)/2;
            mergeSort(arr,min,mid-1);
            mergeSort(arr,mid+1,max);
            merge(arr,min,mid,max);
        }
    }

    //Not totally correct
    private static void merge(int[] arr, int min, int mid, int max) {
        int size1=mid-min+1;
        int size2=max-mid;
        int temp1[]=new int[size1];
        int temp2[]=new int[size2];
        for(int i=0;i<size1;i++) temp1[i]=arr[min+i];
        for(int i=0;i<size2;i++) temp2[i]=arr[mid+1+i];

        int i=0,j=0;

        int k=min;

        while(i<size1 && j<size2){
            if(temp1[i]<=temp2[j]){
                arr[k] = temp1[i];
                i++;
            } else if(temp1[i]>temp2[j]){
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }

        while(i<size1){
            arr[k]=temp1[i];
            i++;k++;
        }

        while(j<size2){
            arr[k]=temp2[j];
            j++;k++;
        }
    }
}
