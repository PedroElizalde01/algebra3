package Guia1;

// Sea An = {a1, a2, ...,an}, verificar si el conjunto es capicúa, es decir a1 = an; a2 = an-1, etc.

public class Ejercicio4 {
    public boolean isCapicua(String word){
        String result="";
        char[] charArray = word.toCharArray();
        for (int i = word.length()-1; i >= 0 ; i--) {
            result += charArray[i];
        }
        return (word.equals(result));
    }
    public boolean isCapicua(int num){
        int number = num;
        int c;
        int inverse=0;
        while (num != 0){
            c = num % 10;
            inverse = inverse * 10 + c;
            num = num / 10;
        }
        return(number == inverse);
    }

    public boolean isCapicua(Object[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(array[array.length-1-i])){
                return false;
            }
        }
        return true;
    }
}
