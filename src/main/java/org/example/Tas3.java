package org.example;

public class Tas3 {
    public static void main(String[] args) {
        int [] [] nums={
        {3,17,88,90,55},
        {44,11,95,7,33},
        };
        for(int i=0;i<2;i++){   //c
            for(int j=0;j<5;j++){  //r
                if(nums[i][j]%2==0){
                    System.out.println(nums[i][j]);
                }
            }
        }
    }
}
