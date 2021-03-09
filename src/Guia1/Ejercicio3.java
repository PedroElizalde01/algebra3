package Guia1;
// Determinar cantidad de ceros de un num Natural. Ej, n = 90450, tiene 2 ceros.
public class Ejercicio3 {
    public int countZeros(int n){
        int total = 0;
        String textNum = ""+n;
        char[] numArray = textNum.toCharArray();
        for (char charNum : numArray){
            if(charNum == '0'){
                total +=1;
            }
        }
        return total;
    }
}
