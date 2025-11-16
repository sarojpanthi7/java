package com.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
      int[] numbers = {-14,-9,-3,0,3,5,8,9,10,15,19,22,27,32};
      int target = 3;
      System.out.println(binarySearch(numbers, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target> arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
