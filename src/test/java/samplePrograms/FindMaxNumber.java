package samplePrograms;

public class FindMaxNumber {

    public static void main(String args[]) {

        // 1. Program to find the maximum number from 3 numbers
        int num1 = 20;
        int num2 = 15;
        int num3 = 25;

        int max;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("Maximum number is: " + max);

    }

}