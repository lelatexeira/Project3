package org.example;

public class Task2 {
    public static void main(String[] args) {
        int [] numbers={3,5,19,77,33,9};
        int sum=0;
        for(int n:numbers){
            sum=sum+n;
        }
        System.out.println("The sum is "+sum);
    }
}
