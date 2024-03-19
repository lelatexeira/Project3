package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int [] temps= {58,62,73,54,70,55,66}; //54-73
        int hiTemp=temps[0];
        int loTemp=temps[0];
        for(int t:temps){
            if(t>hiTemp){
                hiTemp=t;
            }else if(t<loTemp){
                loTemp=t;

        }
    }
        System.out.println("The highest temperature this week is "+hiTemp);
        System.out.println("The lowest temperature this week is "+loTemp);
}



               }








