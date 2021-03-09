package Guia1;
// Investiga el funcionamiento del algoritmo de Euclides y escribe una versión iterativa y una recursiva.

public class Ejercicio7 {
    public int mcd(int a, int b){
        int resto = 1;
        while(resto != 0){
            resto = a % b;
            a = b;
            b=resto;
        }
        return a;
    }

    //public int mcdRecursive(int a, int b)
}
