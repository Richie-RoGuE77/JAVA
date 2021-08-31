import java.util.Scanner;
public class Matrix {
      public static void main(String args[]) {
      int n;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter base of matrices");
      n = input.nextInt();
      int[][] m1 = new int[n][n];
      int[][] m2 = new int[n][n];
      int[][] mat = new int[n][n];
      System.out.println("Enter the elements of 1st matrix row wise : n");
      for (int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
      m1[i][j] = input.nextInt();
      }
      }
      System.out.println("Enter the elements of 2nd matrix row wise : n");
for (int i = 0; i < n; i++) {
for(int j = 0; j < n; j++) {
      m2[i][j] = input.nextInt();
}
}
System.out.println("Multiplying the matrices : ");
for(int i = 0; i < n; i++) {
for(int j = 0; j < n; j++) {
      for(int k = 0; k < n; k++) {
      mat[i][j] = mat[i][j] + m1[i][k] * m2[k][j];
      }
      }
      }	
      System.out.println("Product :");
for (int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
      System.out.print(mat[i][j] + " ");
      }
      System.out.println();
      }
      input.close();
      }
}