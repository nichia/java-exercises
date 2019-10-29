package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.lang.Character.*;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> charList = new HashMap<>();
        String str;


        System.out.println("Enter a string of text: ");
        str = in.nextLine();

        for (char c : str.toCharArray()) {
            // containsKey() checks if this map contains a mapping for a key c
            if (Character.isLetter(c) ) {
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }
                Integer count = charList.containsKey(c) ? charList.get(c) : 0;
                charList.put(c, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> oneChar : charList.entrySet()){
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
