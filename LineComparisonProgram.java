package com.company1.LineComparisonComputation;

public class LineComparisonProgram {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        int X1=2,Y1=3,X2=6,Y2=8;
        double distance1 = Math.sqrt(Math.pow((X2-X1),2) + Math.pow((Y2-Y1),2));
        System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is "+distance1);

        int X3=3,Y3=4,X4=12,Y4=13;
        double distance2 = Math.sqrt(Math.pow((X4-X3),2) + Math.pow((Y4-Y3),2));
        System.out.println("Distance between "+"("+X3+","+Y3+"),"+"("+X4+","+Y4+") is "+distance2);
        String distance01 = distance1+"";
        String distance02 = distance2+"";
        boolean checkEquality = distance01.equals(distance02);
        if (checkEquality)
            System.out.println("Both Lines are Equal");
        else if (distance1<distance2)
            System.out.println("Distance1 is smaller than Distance2");
        else
            System.out.println("Distance2 is Smaller than Distance1");

    }
}
