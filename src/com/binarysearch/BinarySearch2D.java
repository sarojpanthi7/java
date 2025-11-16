package com.binarysearch;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
      int[][] arr2d = {
              {10,20,30,40},
              {15,25,35,45},
              {24,28,37,49}
      };
        int target = 37;
        System.out.println(Arrays.toString(binarySearch2D(arr2d, target)));
    }
    static int[] binarySearch2D(int[][] arr, int target){
      int r = 0;
      int c = arr.length - 1;

      while (r < arr.length && c > 0){
          if(target == arr[r][c]){
              return new int[] {r,c};
          }
          if(arr[r][c] < target){
              r++;
          }
          else{
              c--;
          }
      }
      return new int[] {-1,-1};
    }
}
