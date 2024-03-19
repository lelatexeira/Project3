package org.example;

public class Task6 {
    public static void main(String[] args) {
        int number = 88;
        boolean prime = false;
        for (int i = 0; i < number % 2; i++) {
            if (number % i == 0) {
                prime = true;
                break;
            }
        }

        if (prime) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " isn't prime");
        }

    }
}


