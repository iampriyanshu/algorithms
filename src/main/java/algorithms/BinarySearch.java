package algorithms;

public class BinarySearch {
    public static int iterativeSearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        return iterativeBinarySearch(arr,key,low,high);
    }

    public static int recursiveSearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        return recursiveBinarySearch(arr,key,low,high);
    }

    public static int forwardSearch(int[]arr, int key){
        int low = 0;
        int high = arr.length-1;
        return initialPosition(arr,key,low,high);
    }

    private static int initialPosition(int[] arr, int key, int low, int high) {
        int position = recursiveBinarySearch(arr,key,low,high);
        int finalPosition = recursiveBinarySearch(arr,key,low,position-1);
        if(position == -1 || finalPosition == -1 || position ==0 ) return position;
        else if(finalPosition == 0) return finalPosition;
        else if(finalPosition<position){
            return finalPosition;
        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] arr, int key, int low, int high) {
        if(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key) return mid;
            else{
                if(arr[mid]>key) recursiveBinarySearch(arr,key,low,mid-1);
                else if(arr[mid]<key) recursiveBinarySearch(arr,key,mid+1,high);
            }
        }
        return -1;
    }

    private static int iterativeBinarySearch(int[] arr, int key, int low, int high) {
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]>key) high = mid-1;
            else if(arr[mid]<key) low = mid+1;
        }
        return -1;
    }
}
