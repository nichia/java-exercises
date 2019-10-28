package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String newWord;
        // Declare and initialize an ArrayList of strings
        ArrayList<String> words = new ArrayList<>();

        // Get words
        do {
            System.out.print("Enter a word (or ENTER to finish): ");
            newWord = in.nextLine();

            if (!newWord.equals("")) {
                words.add(newWord);
            }

        } while (!newWord.equals(""));

        // Print each word with exactly 5 letters
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 5) {
                System.out.println(words.get(i));
            }
        }
    }
}
