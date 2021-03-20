package Team2Solution;

public class Guide1RecursiveSolution {
    //1
    public int recursiveB(int n){
        int total = 0;
        if(n > 0){
            total += Math.pow(n--,2);
            total += recursiveB(n);
        }
        return total;
    }

    //2
    public double recursiveC(int n){
        return recursiveC(n,1,1,0,0);
    }
    private double recursiveC(int n, int a, int b, int total, int i) {
        int  c;
        if (i < n-2 ) {
            c = a + b;
            a = b;
            b = c;
            total = c;
            i++;
            return recursiveC(n, a, b,total,i);
        }
        return total;
    }

    //3
    public boolean recursiveIsCapicua(Object[] array){
        return recursiveIsCapicua(array,0);
    }
    private boolean recursiveIsCapicua(Object[] array, int index){
        if(index < array.length){
            if(!array[index].equals(array[array.length-1-index])){
                return false;
            }
            index++;
            return recursiveIsCapicua(array, index);
        }
        return true;
    }

    //4
    private boolean recursiveIsPrimo(int number){
        return recursiveIsPrimo(number, 1,0);
    }
    private boolean recursiveIsPrimo(int number, int index,int counter){
        if(index <= number){
            if((number % index) == 0){
                counter++;
            }
            index++;
            return recursiveIsPrimo(number, index, counter);
        }
        if(counter == 2){
            return true;
        }
        return false;
    }

    public int recursivePrimeNumberQuantity(int number){
        return recursivePrimeNumberQuantity(number, 1,0);
    }
    private int recursivePrimeNumberQuantity(int number, int index, int counter){
        if(index <= number){
            if((number % index) == 0 && recursiveIsPrimo(index)){
                counter ++;
            }
            index++;
            return recursivePrimeNumberQuantity(number, index, counter);
        }
        return counter;
    }

    //5

}
