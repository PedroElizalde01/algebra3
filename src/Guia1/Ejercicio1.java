package Guia1;
/*
a) 1 + 2 + 3 + ... + n;
b) 1^2 + 2^2 + 3^2 + ... + n^2;
c) 1 + p + p^2 + p^3 + ... p^n;
d) 1 + 3 + 5 + ... + 2n-1;
e) 1*2 + 2*3 + 3*4 + ... + n*(n+1);
f) 1^3 + 2^3 + 3^3 + ... n^3;
 */
public class Ejercicio1 {
    //a)
    public double a(int n){
        int total = 0;
        for (int i = n; i > 0; i--) {
            total += i;
        }
        return total;
    }
    //b)
    public double b(int n){
        int total =0;
        for (int i = n; i > 0; i--) {
            total += Math.pow(i,2);
        }
        return total;
    }
    //c)
    public double c(int n, int p){
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += Math.pow(p,i);
        }
        return total;
    }
    //d)
    public double d(int n){
        int total =0;
        for (int i = n; i > 0; i--) {
            if(i%2 != 0){
                total += i;
            }
        }
        return total;
    }
    //e)
    public double e(int n){
        int total = 0;
        for (int i = n; i > 0; i--) {
            total += i*(i+1);
        }
        return total;
    }
    //f)
    public double f(int n){
        int total =0;
        for (int i = n; i > 0; i--) {
            total += Math.pow(i,3);
        }
        return total;
    }
}
