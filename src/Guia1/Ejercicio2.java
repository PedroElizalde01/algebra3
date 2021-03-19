package Guia1;
/*
a) n!
b) 2^n
c) El término n-ésimo de la sucesion Fibonacci
d) MCD(a, b) aplicando el algoritmo de Euclides
 */
public class Ejercicio2 {
    //a)
    public double a(int n){
        int total = n;
        for (int i = n-1; i > 0 ; i--) {
            total *= i;
        }
        return total;
    }
    //b)
    public double b(int n){
        return Math.pow(2,n);
    }
    //c)
    public double c(int n){
        int total=0, a = 1, b = 1, c;
        for (int i = 0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
            total =c;
        }
        return total;
    }
    //d) NO SE COMO SE HACE
}
