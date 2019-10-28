package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class SumArrayList {
    public static void main(String[] args) {
        // Declare and initialize an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));

        System.out.println("printArrayOfNumbers :: ");
        printArrayOfNumbers(numbers);
    }

    public static void printArrayOfNumbers(ArrayList<Integer> numbers) {
        double sum = 0.0;

        // Loop over the arrayList and sum each even number
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        System.out.println(sum);
    }
}
