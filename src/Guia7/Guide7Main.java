package Guia7;

public class Guide7Main {
    public static void main(String[] args) {
        Guide7Solution api = new Guide7Solution();
        double[][] matrixA = {{-1,1,0,0},{1,0,1,0},{1,0,0,1}};
        double[][] matrixC = api.GramSchmidt(matrixA);
        for (double[] doubles : matrixC) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }
    }
}
