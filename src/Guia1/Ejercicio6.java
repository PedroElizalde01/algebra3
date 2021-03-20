package Guia1;
/*
b)
    i) Determinar si un entero positivo, n, es primo.
    ii) Dado un número entero hallar el primer número primo mayor o igual al número dado.
    iii) Determinar la cantidad de factores primos que tiene un número entero.
    iv) Determinar los factores primos que tiene un número entero.
 */
public class Ejercicio6 {
    //i)
    public boolean isPrimo(int n){
        int count =0;
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
    //ii)
    public int searchPrimo(int n){
        if(!isPrimo(n)){
            for (int i = 1;; i++) {
                if(isPrimo(n+i)) return n+i;
            }
        }
        return n;
    }
    //iii)
    public int factoresPrimosCant(int n){
        int count =0;
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0 && isPrimo(i)) count ++;
        }
        return count;
    }
    //iv)
    public int[] factoresPrimos(int n){
        int k = 0;
        int[] arrayPrimos = new int[factoresPrimosCant(n)];
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0 && isPrimo(i)){
                arrayPrimos[k] = i;
                k++;
            }
        }
        
        return arrayPrimos;
    }
}
