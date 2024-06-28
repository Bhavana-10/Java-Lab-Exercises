package array;
import java.util.*;

// Class to perform matrix multiplication
public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input dimensions of the first matrix
        System.out.println("Enter dimensions of the first matrix:");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        
        // Input dimensions of the second matrix
        System.out.println("Enter dimensions of the second matrix:");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        
        // Check if matrix multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
            // return; // Uncomment this line if you want to stop execution if multiplication is not possible
        }
        
        // Input elements of the first matrix
        System.out.println("Enter elements of the first matrix:");
        int[][] matrixA = inputMatrix(sc, rowsA, colsA);
        
        // Input elements of the second matrix
        System.out.println("Enter elements of the second matrix:");
        int[][] matrixB = inputMatrix(sc, rowsB, colsB);
        
        // Initialize result matrix with dimensions based on multiplication
        int[][] resultMatrix = new int[rowsA][colsB];
        
        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        // Output the result of matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
    // Method to input matrix elements
    public static int[][] inputMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt(); // Read each element and store it in the matrix
            }
        }
        return matrix; // Return the filled matrix
    }
}
