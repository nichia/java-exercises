package exercises;

public class PrintArray {
    public static void main(String[] args){
        // Declare and initialize an array of integers
        int[] numbers = {1,1,2,3,4,8};

        for (int i=0; numbers.length > i; i++) {
            System.out.println(numbers[i]);
        }
    }
}
