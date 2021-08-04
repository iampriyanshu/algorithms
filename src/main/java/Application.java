import algorithms.BinarySearch;
import algorithms.MergeSort;
import algorithms.QuickSort;
import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(Application.class);
        int[] arr = new int[]{11,12,14,14,14,14,17,18,18};
        int iterativeResult = BinarySearch.iterativeSearch(arr, 12);
        if(iterativeResult ==-1) System.out.println("Search object not found in array in iterative search.");
        else System.out.println("Object found in index " + iterativeResult + " in iterative search.");

        int recursiveResult = BinarySearch.recursiveSearch(arr, 14);
        if(recursiveResult ==-1) System.out.println("Search object not found in array in recursive search.");
        else System.out.println("Object found in index " + recursiveResult + " in recursive search.");

        /*int initialPosition = BinarySearch.forwardSearch(arr, 14);
        if(initialPosition ==-1) System.out.println("Search object not found in array in forward search.");
        else System.out.println("Object found in index " + initialPosition + " in forward search.");

        //Arrays.sort();*/

        arr = new int[]{40,10,50,60,30,90,80};
        QuickSort.quicksort(arr,0,arr.length-1);
        System.out.println("QUICKSORT RESULT : ");
        Arrays.stream(arr).forEach(System.out::println);

        arr = new int[]{80,10,50,60,30,20,90,40};
        MergeSort.mergeSort(arr,0,arr.length-1);
        System.out.println("MERGESORT RESULT : ");
        Arrays.stream(arr).forEach(System.out::println);

        int max = Arrays.stream(arr).max().getAsInt();



    }
}
