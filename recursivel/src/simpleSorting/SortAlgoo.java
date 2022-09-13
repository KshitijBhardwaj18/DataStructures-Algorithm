package simpleSorting;

import java.util.Arrays;

public class SortAlgoo {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {};
        int[] arr3 = {-2,-4,2,5,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void CyclicSort(int[] arr){
        for (int i = 0; i < arr.length  ; i++) {
            if(arr[i] != i + 1){
                swap(arr,i,arr[i] -1);
            }
        }
    }

    static void insertion(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }
        }
    }

    static void bubble(int[] arr){
        boolean swapped = false;

        // run the steps n-1 times
        for(int i = 0; i < arr.length; i++){

            for(int j =1;j<=arr.length-1-i;j++ ){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if not swapped for any particular value of i then stop
            if(!swapped)/*/!false == true/*/ {
                break;
            }
        }
    }

    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - 1 -i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);



        }

    }

    static void swap(int[] arr, int first,  int second){
        int temp =  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;


    }
}