package org.launchcode.java.studios.ch3.countingcharacters;

import java.util.Scanner;
import java.util.HashMap;
//import java.util.Map;


public class CharacterCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take in a string
        //String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.println("Enter some text: ");
        String myString = input.nextLine();
        char[] charactersInString = myString.toCharArray();
        //keep track of how many times characters appear in string
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for(char character : charactersInString) {
            if (characterCount.containsKey(character)) {
                int currentCount = characterCount.get(character);
                characterCount.put(character, currentCount + 1);
            }
            else { characterCount.put(character, 1);

            }
        }
        for (Character character: characterCount.keySet()) {
            System.out.println(character + ": " + characterCount.get(character));
        }

//        for(Map.Entry<Character, Integer> pair : characterCount.entrySet()) {
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
    }
}
