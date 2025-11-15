package com.linearSearch;

import java.util.Arrays;

public class Search2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7,88},
                {8,9,10}
        };
        int target = 9;
        int[] ans = search2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] arr, int target){
        for(int r=0; r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c] == target)
                {
                    return new int[] {r+1, c+1};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
