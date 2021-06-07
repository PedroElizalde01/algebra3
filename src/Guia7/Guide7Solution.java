package Guia7;

public class Guide7Solution {

    //1)
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
    public boolean isSimetrica(int[][] matrix){
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length ; j++){
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
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

    //3) d) III)
    public int[][] multiply(int[][] a, int[][] b) {
        int[][] toReturn = new int[a.length][b[0].length];
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        toReturn[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        return toReturn;
    }

    //4)
    public double[][] GramSchmidt(double[][] base){
        double[][] VectorOrtogonal = new double[base.length][base[0].length];
        VectorOrtogonal[0] = base[0];
        for (int i = 1; i < VectorOrtogonal.length; i++) {
            VectorOrtogonal[i] = GramSchmidtFormula(base[i], VectorOrtogonal,i-1);
        }
        return VectorOrtogonal;
    }

    public double[] GramSchmidtFormula(double[] v, double[][]w, int index){
        double[] e;
        double[] toReturn = new double[v.length];
        if(index==0){
            double a = ((mult(w[0],v))/mult(w[0],w[0]));
            e = multVector(w[0], a);
            toReturn = rest(v, e);
        }
        if(0 < index){
            double a = ((mult(w[index],v))/mult(w[index],w[index]));
            e = multVector(w[index], a);
            return rest(GramSchmidtFormula(v,w,index-1),e);
        }
        return toReturn;
    }

    public double mult(double[] v, double[]w){
        double result = 0;
        for (int i = 0; i < v.length; i++) {
            result += (v[i] * w[i]);
        }
        return result;
    }

    public double[] rest(double[] v, double[]w){
        double[] result = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            result[i] = (v[i] - w[i]);
        }
        return result;
    }

    public double[] multVector(double[] v, double w){
        double[] result = new double[v.length];

        for (int i = 0; i < v.length; i++) {
            result[i] = (v[i] * w);
        }
        return result;
    }
}
