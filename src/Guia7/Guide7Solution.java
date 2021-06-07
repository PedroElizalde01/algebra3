package Guia7;

public class Guide7Solution {

    public int excercise1B(int[][] matrix){
        int totalSum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == matrix[i].length-j-1){
                    totalSum += matrix[i][j];
                }
            }
        }
        return totalSum;
    }

    //2)
    public boolean isSimetrical(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix.length != matrix[i].length) return false;
            }
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] != matrix[j][i]) return false;
            }
        }
        return true;
    }

    public boolean isDiagonalDominant(int[][] matrix){
        int diagonalNum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j){
                    diagonalNum = matrix[i][j];
                }else{
                    total += matrix[i][j];
                }
            }
            if(Math.abs(diagonalNum) < Math.abs(total)) return false;
        }
        return true;
    }

    //3) d) III) REHACER  <--------------------------
    public int[][] multiplyMatrix(int[][] A, int[][] B) throws CannotMultiplyException {
        if(A[0].length != B.length) throw new CannotMultiplyException();
        int[][] toReturn = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            int c = 0;
            int suma = 0;
            for (int j = 0; j < B[i].length; j++) {
                suma = suma + (A[i][j] * B[i][j]);
                toReturn[i][j] = suma;
            }
        }
        return toReturn;
    }

//4)
    /*
    public int[][] orthogonalize(int[][] base){
        int[][] toReturn = new int[base.length][base[0].length];
        int[] w1 = base[0];

    }

     */

}

class CannotMultiplyException extends Exception {
    public CannotMultiplyException(){
        super("The matrices cannot be multiplied");
    }
}
