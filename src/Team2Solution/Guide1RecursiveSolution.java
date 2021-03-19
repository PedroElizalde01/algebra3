package Team2Solution;

public class Guide1RecursiveSolution {
    //1
    public double recursiveB(int n){
        double total = 0;
        if(n > 0){
            total += Math.pow(n--,2);
            total += recursiveB(n);
        }
        return total;
    }

    //2
    public double recursiveC(int n){
        return recursiveC(n,1,1);
    }

    private double recursiveC(int n, int a, int b) {
        int total = 0, c, i = 0;
        if (i <= n - 2) {
            c = a + b;
            a = b;
            b = c;
            total = c;
            i++;
            recursiveC(i, a, b);
        }
        return total;
    }
}
