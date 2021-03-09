package Guia1;
//Escribir una versión iterativa y una recursiva de la regla de Horner. Comparar la cantidad de
//multiplicaciones y sumas con respecto a la forma tradicional de evaluar un polinomio.

import java.util.Scanner;
//dividir el metodo en otro mas chico

public class Ejercicio8 {
    public String hornersMethod(int grado){
        Scanner input = new Scanner(System.in);
        int[] functionArray = new int[grado+1];
        for (int i = 0; i <= grado; i++) {
            System.out.println("para X^" + i+": ");
            int num = input.nextInt();
            functionArray[i] = num;
        }
        String function ="";
        for (int i = functionArray.length-1; i >= 0 ; i--) {
            if(i != 0){
                function +=functionArray[i]+"X^"+i+" + ";
            }else{
                function += functionArray[i]+"X^"+i;
            }
        }
        String hornersFunction="";
        String m = "("+functionArray[functionArray.length-1]+"X + ";
        for (int i = functionArray.length-1; i >= 0 ;) {
            if(i!=0){
                m = "("+functionArray[i]+"X + "+functionArray[i-1]+")";
                hornersFunction +=m;
            } else {
                hornersFunction += m + "X + " + functionArray[i];
            }
            i-=2;
        }
        return hornersFunction;
    }
}

// creo variable que sea del tipo '(ax + b)' y lo llamo n
// luego digo que '(nx + c)' y lo llamo m
// y digo '(mx + d)' y sigo asi hasta que


//NO ANDA MUY BIEN