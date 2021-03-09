package Guia1;
//Dado un conjunto de números enteros verificar si un número dado pertenece al conjunto

public class Ejercicio5 {
    //conjunto como array:
    public boolean isInArray(int n, int[] intArray){
        for(int num : intArray){
            if(n == num) return true;
        }
        return false;
    }

    // buscar entre dso numeros:
    public boolean isBetween(int a, int b, int num){
        if (a < b) {
            if(num > a && num < b) return true;
        }else{
            if(num < a && num > b) return true;
        }
        return false;
    }
}
