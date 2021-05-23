package Guia6;


public class guide6Main<T extends Comparable<T>> {
    public static void main(String[] args) {
        Guide6Solution api = new Guide6Solution();
        String[] array = {"123123","345345","456456","678678"};
        System.out.println(api.exercise1B(array));
    }

}
