import java.util.Scanner;

public class Passing2DMatrixToMethod {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        setMatrix(matrix);
        printMatrix(matrix);

        doubleTheElementsInsideMatrix(matrix);
        System.out.println("Matrix after doubling it's elements.........");
        printMatrix(matrix);
    }
    public static int[][] setMatrix(int[][] matrix){
        System.out.println("Enter the elements inside the matrix");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        System.out.println("The elements of the matrix are.......");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] doubleTheElementsInsideMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = matrix[i][j] * 2;
            }
        }
        return matrix;
    }

}
