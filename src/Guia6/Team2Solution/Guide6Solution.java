package Guia6.Team2Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Guide6Solution<T extends Comparable<T>> {
    private Survey[] surveyArray;

    public Guide6Solution() {
        this.surveyArray = new Survey[0];
    }

    public T exercise1B(T[] array){
        T maximum = array[0];
        for (int i=1; i<array.length; i++) {
            if (maximum.compareTo(array[i]) < 0) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public int[] exercise6(int[] arrayToAdd){
        int[] arrayToReturn = arrayToAdd.clone();
        for (int i = 0; i < arrayToAdd.length; i++) {
            arrayToReturn[i] = arrayToAdd[i];
            for (int j = 0; j < i; j++) {
                arrayToReturn[i] += arrayToAdd[j];
            }
        }
        for (int i = 0; i < arrayToReturn.length; i++) {
            System.out.print(arrayToReturn[i] + " = ");
            for (int j = 0; j <= i; j++) {
                if(j!=i){
                    System.out.print(arrayToAdd[j] +" + ");
                }else{
                    System.out.print(arrayToAdd[j]);
                }
            }
            System.out.println();
        }
        return arrayToReturn;
    }

    public boolean exercise4(int[] array){
        int totalSum = 0;
        for (int j : array) {
            totalSum += j;
            if (totalSum < 0) {
                return false;
            }
        }
        return totalSum == 0;
    }

    public void exercise7(){
        int option;
        do{
            printMenu();
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            if (option != 1 && option != 2 && option != 3){
                System.out.println("\nInvalid number, try again\n");
                exercise7();
            }
            switch (option) {
                case 1 -> submitSurvey();
                case 2 -> showInformation();
                case 3 -> System.exit(0);
            }
        }while(option<3);
    }

    private void submitSurvey() {
        Scanner input = new Scanner(System.in);
        System.out.println("Is Fiction?(true or false)");
        boolean isFiction = input.nextBoolean();
        System.out.println("Age:");
        int age = input.nextInt();
        System.out.println("Sex: (M or F)");
        char sex = input.next().charAt(0);
        Survey newSurvey = new Survey(isFiction,age,sex);
        surveyArray = Arrays.copyOf(surveyArray, surveyArray.length + 1);
        surveyArray[surveyArray.length - 1]= newSurvey;

    }

    private void showInformation() {
        System.out.println("Percentage of women reading Fiction booxs:");
        int counter = 0;
        for (Survey survey : surveyArray) {
            if (survey.sex == 'f' && survey.isFiction) counter++;
        }
        int porcentaje = (100*counter)/ surveyArray.length;
        System.out.println(porcentaje+" %");

        System.out.println("Average age: ");
        int agePromedio = 0;
        for (Survey survey : surveyArray) {
            agePromedio += survey.age;
        }
        System.out.println((agePromedio)/ surveyArray.length);

        System.out.println("People older than 21 reading non-Fiction books: ");
        int personasMayoresA21 =0;
        for (Survey survey : surveyArray) {
            if (survey.age > 21 && !survey.isFiction) personasMayoresA21++;
        }
        System.out.println(personasMayoresA21+"\n");
    }

    private void printMenu(){
        System.out.println("1. Submit new survey");
        System.out.println("2. Show information");
        System.out.println("3. Exit\n\n");
        System.out.println("Choose an option: ");
    }
}
