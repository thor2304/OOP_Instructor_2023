package playground;

import java.util.Scanner;

public class ExerciseExceptions {
    public static void main(String[] args) {
        int[] array = {903,716,67};

        while (true){
            printFromArray(robustGetInputFromUser(), array);
        }
    }

    static int getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }

    static int robustGetInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            return scanner.nextInt();
        } catch (Exception e){
            System.out.println("Invalid input, you must provide an integer");
            return robustGetInputFromUser();
        }
    }

    static void printFromArray(int index, int[] array) {
        try{
            System.out.println("The value at index: " + index + " is: " + array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index " + index + " out of bounds");
        }
    }
}
