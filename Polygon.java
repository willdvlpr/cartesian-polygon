import java.util.Scanner;
import java.io.*;

public class Polygon {
  public static int LENGTH = 20;
  public static double[] x_coordinates = new double[LENGTH];
  public static double[] y_coordinates = new double[LENGTH];

  public static void inputPoints(int n) {
    Scanner input = new Scanner(System.in);

    for (int i = 0 ; i < n; i++) {
      int coordinate = i + 1;
      System.out.print("Enter x coordinate " + coordinate + ": ");
      x_coordinates[i] = input.nextDouble();

      System.out.print("Enter y coordinate " + coordinate + ": ");
      y_coordinates[i] = input.nextDouble();
    }

    return;
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
    Scanner input = new Scanner(System.in);
    System.out.println("How many points?: ");
    int n = input.nextInt();
    inputPoints(n);
    double area = computeArea(x_coordinates, y_coordinates, n);
    System.out.println("Area is " + area);
  }
}
