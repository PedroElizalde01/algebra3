package Team2Solution;

public class Guide1RecursiveSolution {
    //1
    public double recursiveB(int n){
        int total = 0;
        if(n > 0){
            total += Math.pow(n,2);
            n--;
            recursiveB(n);
        }
        return total;
    }
}
