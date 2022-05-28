package line_comparison;

import java.util.Scanner;

public class LineComparison {
    void lengthCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 co-ordinate:");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 co-ordinate:");
        int x2 = sc.nextInt();
        System.out.print("Enter y1 co-ordinate:");
        int y1 = sc.nextInt();
        System.out.print("Enter y2 co-ordinate:");
        int y2 = sc.nextInt();

        Double lenOfLineFirst = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of first line " + lenOfLineFirst);

        System.out.print("Enter x3 co-ordinate:");
        int x3 = sc.nextInt();
        System.out.print("Enter x4 co-ordinate:");
        int x4 = sc.nextInt();
        System.out.print("Enter y3 co-ordinate:");
        int y3 = sc.nextInt();
        System.out.print("Enter y4 co-ordinate:");
        int y4 = sc.nextInt();

        Double lenOfLineSecond = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        System.out.println("Length of first line " + lenOfLineSecond);

        if (lenOfLineFirst.equals(lenOfLineSecond))
            System.out.println("Line is equal");
        else
            System.out.println("Lines are not equal");

        int value = lenOfLineFirst.compareTo(lenOfLineSecond);
        if (value < 0) {
            System.out.println("Line one is smaller than line two");
        } else if (value > 0) {
            System.out.println("Line one is larger than line two");
        } else {
            System.out.println("Both lines are equal");
        }
    }

    public class LineComparisonProgram {
        public static void main(String[] args) {
            System.out.println("Welcome to Line Comparison Computation Program");
            LineComparison linecomparison = new LineComparison();
            linecomparison.lengthCalculation();
        }
    }
}
