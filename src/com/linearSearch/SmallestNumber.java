package com.linearSearch;

public class SmallestNumber {
    public static void main(String[] args) {
       int[] arr = {55,2,5,66, 4,3,66};
        System.out.println("Smallest number is: "+ smallest(arr));
    }
    static int smallest(int[] arr){
        int smallest = arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
