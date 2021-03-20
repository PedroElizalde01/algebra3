package Team2Solution;

public class Guide1IterativeSolution {
    //@authors - Juan Cruz Estevez y Pedro Elizalde
    //1
    public int iterative1B(int n){
        int total =0;
        for (int i = n; i > 0; i--) {
            total += Math.pow(i,2);
        }
        return total;
    }

    //2
    public double iterative2C(int n){
        int total=0, a = 1, b = 1, c;
        for (int i = 0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
            total = c;
        }
        return total;
    }

    //3
    public boolean iterativeIsCapicua(Object[] array){
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(array[array.length-1-i])){
                return false;
            }
        }
        return true;
    }

    //4
    private boolean iterativeIsPrimo(int number){
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if((number % i) == 0){
                counter++;
            }
        }
        if(counter == 2){
            return true;
        }
        return false;
    }

    public int iterativePrimeNumberQuantity(int number){
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if((number % i) == 0 && iterativeIsPrimo(i)) counter ++;
        }
        return counter;
    }

    //5

    public int horner(int x, int[] coeficientes){
        int result = 0;
        for (int i = 0; i < coeficientes.length; i++) {
            result = result * x + coeficientes[i];
        }
        return result;
    }

    public String hornerPoli(int[] coeficientes){
        String poli = null;
        for (int i = 0; i < coeficientes.length; i++) {
            if (i==0){
                poli = coeficientes[i] + "x";
            }else{
                if (i == coeficientes.length-1){
                    poli = poli + "+" + coeficientes[i];
                }else{
                    poli = "(" + poli + "+" + coeficientes[i] + ")x";
                }

            }
        }
        return poli;
    }


}
