package Team2Solution;

public class Guide1IterativeSolution {
    //1
    public double iterativeB(int n){
        int total =0;
        for (int i = n; i > 0; i--) {
            total += Math.pow(i,2);
        }
        return total;
    }

    //2
    public double iterativeC(int n){
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


    //4
    private boolean isPrimo(int n){
        int count =0;
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0){
                count++;
            }
        }
        if(count <= 2){
            return true;
        }
        return false;
    }
    public int cantFactoresPrimos(int n){
        int count =0;
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0 && isPrimo(i)) count ++;
        }
        return count;
    }

    //5



}
