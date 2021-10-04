package com.company.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void calculateAvg(List<Double> doubleList){
        double positiveCounter = 0;
        double sum = 0;
        for (double dbl: doubleList) {
            if(dbl > 0){
                positiveCounter++;
                sum += dbl;
            }
        }
        System.out.println(sum / positiveCounter);
    }


    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double newDouble;
        do {
            System.out.print("Enter a number: ");
            try {

                newDouble = Double.parseDouble(sc.nextLine());
            } catch (Exception exception){
                System.out.println("Not a number!");
                throw new IllegalArgumentException();
            }
            doubleList.add(newDouble);
        }
        while (newDouble != 0);
        Calculator.calculateAvg(doubleList);
    }

}
