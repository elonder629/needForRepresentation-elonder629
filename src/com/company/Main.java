package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        String encrypted = "";
        System.out.println("Enter word");
        word = input.nextLine();
        int starter = (int)(Math.random() * word.length());
        String beginner = word.substring(0, starter);
        String ender = word.substring(starter);
        word = ender + beginner;

        int order = (int)(Math.random() * 5);
        for(int x = 1; x < word.length(); x++) {
            char convert = word.charAt(x);
            if(order  == 5)
                order = 0;
            else if(order == 0)
                encrypted += Integer.toBinaryString((int)convert);
            else if(order == 1)
                encrypted += Integer.toOctalString((int)convert);
            else if(order == 2)
                encrypted += (int)convert;
            else if(order == 3)
                encrypted += Integer.toHexString((int)convert);
            else if(order == 4)
                encrypted += convert;
            order++;

        }
        System.out.println(encrypted);

    }
}