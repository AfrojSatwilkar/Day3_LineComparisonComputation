package com.company1.LineComparisonComputation;

public class LineComparisonProgram {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        int X1=2,Y1=3,X2=6,Y2=8;
        double distance1 = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
        System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is "+distance1);

        int X3=3,Y3=4,X4=12,Y4=13;
        double distance2 = Math.sqrt((X4-X3)*(X4-X3) + (Y4-Y3)*(Y4-Y3));
        System.out.println("Distance between "+"("+X3+","+Y3+"),"+"("+X4+","+Y4+") is "+distance2);

        boolean check = distance1==distance2;
        if (check)
            System.out.println("Both Lines are Equal");
        else
            System.out.println("Both lines are not Equal");
    }
}
