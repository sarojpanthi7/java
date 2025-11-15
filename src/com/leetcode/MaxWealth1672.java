package com.leetcode;

public class MaxWealth1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        int total = 0;
        for (int i=0;i<accounts.length;i++){
            total = 0;
            for(int j=0;j<accounts[i].length;j++){
                total = total + accounts[i][j];
                if(total>max){
                    max = total;
                }
            }
        }
        return max;
    }
}
