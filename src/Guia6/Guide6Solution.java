package Guia6;

public class Guide6Solution<T extends Comparable<T>> {

    public T exercise1B(T[] array){
        T maximum = array[0];
        for (int i=1; i<array.length; i++) {
            if (maximum.compareTo(array[i]) < 0) {
                maximum = array[i];
            }
        }
        return maximum;
    }

}
