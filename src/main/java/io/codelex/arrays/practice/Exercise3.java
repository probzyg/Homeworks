package io.codelex.arrays.practice;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }


        System.out.println("Average value of the array elements is : " + (sum / numbers.length));

    }
}
