package com.linearSearch;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        int key = 4;
        int result = linearSearch(nums, key);
        System.out.println(key+" found at index: "+result+" and position: "+(result+1));
    }
   static int linearSearch(int[] arr, int target){
        if(arr.length<1){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
   }
}

