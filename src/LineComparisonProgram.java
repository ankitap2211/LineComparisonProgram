package line_comparison;

import java.util.Scanner;

public class LineComparison {
    void lengthCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 co-ordinate:");
        int x1 = sc.nextInt();
        System.out.print("Enter x1 co-ordinate:");
        int x2 = sc.nextInt();
        System.out.print("Enter y1 co-ordinate:");
        int y1 = sc.nextInt();
        System.out.print("Enter y2 co-ordinate:");
        int y2 = sc.nextInt();

        Double lenOfLineFirst = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of first line " + lenOfLineFirst);
    }

public class LineComparisonProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
	LineComparison linecomparison = new LineComparison();
        linecomparison.lengthCalculation();
    }
}
