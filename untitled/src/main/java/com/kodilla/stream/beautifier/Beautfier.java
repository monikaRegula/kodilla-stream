package com.kodilla.stream.beautifier;

public class Beautfier {
    public static String bigLetters(String s){
       return s.toUpperCase();
    }
    public static String smallLetters(String s){
        return s.toLowerCase();
    }
    public static String addingABC(String s){
        return "ABC"+s+"ABC";
    }
    public static String replaceAToE(String s){
        return s.replace('A','E');
    }
    public static String replaceABCtoCBA (String s){
        return s.replace("ABC","CBA");
    }

}
