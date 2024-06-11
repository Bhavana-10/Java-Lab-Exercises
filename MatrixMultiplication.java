package array;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dimensions of the first matrix:");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        System.out.println("Enter dimensions of the second matrix:");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
            //return;
        }
        System.out.println("Enter elements of the first matrix:");
        int[][] matrixA = inputMatrix(sc,rowsA,colsA);  
        System.out.println("Enter elements of the second matrix:");
        int[][] matrixB = inputMatrix(sc,rowsB,colsB);
        int[][] resultMatrix = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k]*matrixB[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] inputMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
	}
}
