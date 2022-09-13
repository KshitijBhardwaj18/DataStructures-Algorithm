package array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,34,4,4,3,4,34,3,4,3,4,3,2,24};



        System.out.println(findAllIndex2(arr,4,0));
    }

    static boolean find(int[] arr,int target,int index){
        if(arr[index] == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index + 1);
    }


    // finding index of the target element
    static int findIndex(int[] arr, int target, int index){
        if(arr[index]==arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr,target,index+1);
        }

    }

    //finding index from last

    static int findIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return findIndexLast(arr,target,index-1);
        }
    }


    //returning list of all index at which number occurs by making an arraylist outside
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length -1){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr,target,index+1);

    }

    // returning arraylist without creating it outside

      static ArrayList findALlIndex1(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        return findALlIndex1(arr,target,index+1,list);

      }


      // returning a list without making it outside and passing it in argument
      static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
         ArrayList<Integer> list = new ArrayList<>();

         if(index == arr.length){
             return list;
         }

         if(arr[index] == target){
             list.add(index);
         }

         ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);

         list.addAll(ansFromBelowCalls);

         return list;
      }




}
