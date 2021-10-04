
package com.company.third;

public class Shape {

    public void areaCalculation(int integer){
        int result = integer * integer;
        System.out.println("Terület: " + result);
    }

    public void areaCalculation(int integer1, int integer2){
        int result = integer1 * integer2;
        System.out.println("Terület: " + result);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.areaCalculation(4);
        shape.areaCalculation(12, 5);
    }
}
