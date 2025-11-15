package com.linearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Saroj";
        char target = 'r';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char key){
        if(str.isEmpty()){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == key){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char key){
        for(char ch: str.toCharArray()){
            if(ch == key){
                return true;
            }
        }
        return false;
    }
}
