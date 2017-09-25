package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string to be encrypted");
        String orgin = input.next();
        StringBuilder encrypted = new StringBuilder();
        Random rand = new Random();
        int randomNum = (int)(Math.random()*(rand.nextInt((orgin.length() - 1) + 1) + 1));
        System.out.println(randomNum);
        for (int i = randomNum; i < orgin.length(); i++){
            if(i == 0){

            }
            else if(i == 1){

            }


        }

    }
}
