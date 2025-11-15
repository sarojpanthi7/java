package com.linearSearch;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {12,17,-2,44,23,12,88,96,3,4,7};
        int target = 23;
        int searchFrom = 3;
        int searchTo = 6;
        System.out.println(searchWithinRange(arr, searchFrom, searchTo, target));
    }
    static boolean searchWithinRange(int[] nums, int start, int end, int target){
        for(int i=start;i<=end;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
