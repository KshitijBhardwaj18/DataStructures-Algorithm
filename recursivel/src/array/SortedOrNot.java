package array;

public class SortedOrNot {
    public static void main(String[] args) {
          int[] arr = {1,4,3,4};
        System.out.println(checkSort2(arr,0));
    }

    static boolean checkSort1(int[] arr){
        return helper1(arr,0);
    }

    private static boolean helper1(int[] arr, int index) {
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }

            return helper1(arr,index+1);

    }

    static boolean checkSort2(int[] arr, int index){
        // base condition
        if (index == arr.length -1){
            return true;
        }

        return arr[index] < arr[index + 1] && checkSort2(arr, index+1) ;
    }


}
