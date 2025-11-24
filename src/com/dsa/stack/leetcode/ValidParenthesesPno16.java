package com.dsa.stack.leetcode;

import java.util.Scanner;

public class ValidParenthesesPno16 {
    static int MAX = 10000;
    static char stack[] = new char[MAX];
    static int tos = -1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string of parantheses to test validation: ");
        String s = input.next();
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        tos = -1;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                push(ch);
            }

            else if(ch == ')' || ch == '}' || ch ==']'){
                if(tos == -1){
                    return false;
                }
                char top = pop();
                if(ch == ')' && top != '(' || ch == '}' && top != '{' || ch ==']' && top != '['){
                    return false;
                }
            }
        }
        return tos == -1;
    }
    static void push(char c){
        if(tos == MAX -1){
            System.out.println("Stack is full");
        }
        else{
            tos++;
            stack[tos] = c;
        }
    }

    static char pop(){
        if(tos == -1){
            System.out.println("Stack is empty");
        }
        else{
            char c = stack[tos];
            tos--;
            return c;
        }
        return '#';
    }
}