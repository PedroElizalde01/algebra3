package Guia2;

public class Ejercicio12 {
    public static double ejercicio10(int n){
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total +=i*(Math.pow(n,i));
        }
        return total;
    }

    public static void main(String[] args) {
    }
}
