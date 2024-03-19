package org.example;

public class Task8 {
    public static void main(String[] args) {
        int[][] nums = {
                {3,7,55,10,78,34},
                {44,8,92,19,22,60},
            };
        int min=nums[1][1];
        int max=nums[1][1];

        for(int i=0;i<2;i++) {
            for(int j=0;j<6;j++){
                if(nums[i][j]<=min) {
                    min = nums[i][j];
                }else if (nums[i][j]>=max){
                    max=nums[i][j];

                }
            }

        }
        System.out.println("Minimum number is "+min);
        System.out.println("Maximum number is "+max);
    }
}
