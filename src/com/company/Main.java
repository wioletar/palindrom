package com.company;

import java.util.Scanner;

public class Main {

    public static String reverse(String originalWord){
        String reverseWord = new String();
        char temporary;
        for (int i=originalWord.length()-1;i>=0;i--){
            temporary=originalWord.charAt(i);
           reverseWord+=temporary;
           }
        return reverseWord;
    }

    public static void isPalindrom(String word){
        String newWord=reverse(word);
        if(newWord.equals(word)){
            System.out.println("Podany ciąg znaków jest palindromem.");
        } else {
            System.out.println("Podany ciąg znaków nie jest palindromem.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków: ");

        String word = scanner.next();

        System.out.println("Długość podanego ciągu znaków wynosi: "+word.length());

        System.out.println("Ciąg znaków w odwróconej kolejności to: "+reverse(word));

        isPalindrom(word);

        
    }
}
