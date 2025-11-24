package com.dsa.stack;

import java.util.Scanner;

public class Stack {
    static int MAX = 5;
    static int tos = -1;
    static int[] stack = new int[MAX];
    public static void main(String[] args) {
        int choice, value;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("-------STACK Operation---------");
            System.out.println("1. Enter 1 to push");
            System.out.println("2. Enter 2 to pop");
            System.out.println("3. Enter 3 to peek");
            System.out.println("4. Enter 4 to display");
            System.out.println("5. Enter 5 to exit");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter a value to push: ");
                    value = input.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Case please re-enter");
            }
        }
    }
    static void push(int value){
        if(tos == MAX - 1){
            System.out.println("Stack is full cannot push");
        }
        else{
            tos++;
            stack[tos] = value;
            System.out.println("\n"+value+ " pushed into stack\n");
        }
    }
    static void pop(){
        if(tos == -1){
            System.out.println("Stack is empty! Nothing to pop.");
        }
        else{
            System.out.println("\n"+stack[tos] + " popped from the stack\n");
            tos--;
        }
    }
    static void peek(){
        if(tos == -1){
            System.out.println("Stack is empty! Nothing to peek.");
        }
        else{
            System.out.println("\n"+stack[tos] + " peeked from the stack");
        }
    }

    static void display(){
        if(tos == -1){
            System.out.println("Stack is empty! There is nothing to display");
        }
        else{
            for(int i = tos;i>=0;i--){
                System.out.println(stack[i]+" ");
            }
        }
    }
}
