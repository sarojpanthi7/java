package com.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
      int[] arr1 = {19,16,13,8,7,4,3,0,-2,-4,-10};
      int[] arr2 = {-15,-10,-6,0,2,4,7,8,9,12,15};
        System.out.println(orderAgnosticBs(arr1,13));
        System.out.println(orderAgnosticBs(arr2,9));
    }
    static int orderAgnosticBs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
