package Guia7;

public class Guide7Main {
    public static void main(String[] args) throws CannotMultiplyException {
        Guide7Solution api = new Guide7Solution();
        int[][] matrixA = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] matrixB = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] matrixC = api.multiplyMatrix(matrixA, matrixB);
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j]+" ");
            }
            System.out.println();
        }
    }
}
