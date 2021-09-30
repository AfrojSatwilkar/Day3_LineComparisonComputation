package com.company1.LineComparisonComputation;

public class LineComparisonProgram {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        int X1=2,Y1=3,X2=6,Y2=8;
        double distance = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
        System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is "+distance);
    }
}
