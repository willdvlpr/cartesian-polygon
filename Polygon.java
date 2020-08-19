import java.util.Scanner;
import java.io.*;

public class Polygon {
  public static int LENGTH = 20;

  public static double inputPoints() {
    Scanner input = new Scanner(System.in);

    System.out.println("How many points?: ");
    int n = input.nextInt();
    double[] x_coordinates = new double[LENGTH];
    double[] y_coordinates = new double[LENGTH];
    for (int i = 0 ; i < n; i++) {
      int coordinate = i + 1;
      System.out.print("Enter x coordinate " + coordinate + ": ");
      x_coordinates[i] = input.nextDouble();

      System.out.print("Enter y coordinate " + coordinate + ": ");
      y_coordinates[i] = input.nextDouble();
    }

    double area = computeArea(x_coordinates, y_coordinates, n);
    return Math.abs(area);
  }

  public static double computeArea(double X[], double Y[], int n) {

    double areaToCompute = 0.0;
    int j = n - 1;

    for (int i = 0; i < n; i++)
    {
      areaToCompute += (X[j] + X[i]) * (Y[j] - Y[i]);
      j = i;
    }
    return areaToCompute/2.0;
  }

  public static void main(String[] args) {
      double polygonArea = inputPoints();
      System.out.println(polygonArea);
  }
}
