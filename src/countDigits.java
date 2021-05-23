public class countDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(456));
    }
    public static int countDigits(int num){
        String numString = ""+num;
        return numString.length();
    }


}

