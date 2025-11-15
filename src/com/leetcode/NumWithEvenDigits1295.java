package com.leetcode;

public class NumWithEvenDigits1295 {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,7,8,88};
        int digitcount = 0;
        int evencount = 0;
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            while(element>0){
                element /= 10;
                digitcount++;
            }
            if(digitcount %2 == 0){
                evencount++;
            }
        }
        System.out.println(evencount);
    }
}
