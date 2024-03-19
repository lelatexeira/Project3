package org.example;

public class Task4 {
    public static void main(String[] args) {
        int [][] nums= {
                {8, 34, 22, 76, 2},
                {77, 50, 11, 43, 3},
        };
        int sum1=0;
        int sum2=0;
        for(int i=0;i<2;i++){       //c
            for(int j=0;j<5;j++){     //r
                if(nums[i][j]%2==0) {
                    sum1 += nums[i][j];
                }else{
                    sum2+=nums[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers is "+sum1);
        System.out.println("Sum of odd numbers is "+sum2);
    }
}
