package org.example;

public class Task9 {
    public static void main(String[] args) {
        int [] [] numbers= {
                {32, 11, 4, 18, 9, 44},
                {77, 38, 12, 6, 13, 92}
            };

        int large1=numbers[0][0];
        int large2=numbers[0][0];
        for(int i=0;i<2;i++){
            for(int j=0;j<6;j++){
                if(numbers[i][j]>large1){
                    large2=large1;
                    large1=numbers[i][j];
                }else if(numbers[i][j]>large2){
                    large2=numbers[i][j];
                }
            }

        }
        System.out.println("The second largest number is "+large2);
    }
}
