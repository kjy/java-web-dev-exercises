package exercises.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java. util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
//        ArrayList<Integer> numbersToSum = new ArrayList<Integer>();
//        numbersToSum.add(1);
//        numbersToSum.add(2);
//        numbersToSum.add(3);
//        numbersToSum.add(4);
//        numbersToSum.add(5);
//        numbersToSum.add(6);
//        numbersToSum.add(7);
//        numbersToSum.add(8);
//        numbersToSum.add(9);
//        numbersToSum.add(10);
//        ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//        ArrayListPractice.sumAllEvenValues(numbersToSum);
//        Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
//        System.out.println("The sum is: " + theSum.toString());

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitAGivenString();

        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));
        System.out.println("What word length are you looking for: ");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
        ArrayListPractice.printWordsWithFiveLetters(wordsToSearch, searchLength);
    }

    public static Integer getUserSearchInput() {
        Scanner scanner = new Scanner(System.in);
        Integer myUsersInt = scanner.nextInt();
        scanner.close();
        return myUsersInt;
    }
    public static void printWordsWithFiveLetters(ArrayList<String> words, Integer searchLength) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }


    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum) {
        Integer sum = 0;
        for (int i = 0; i < valuesToSum.size(); i++) {
            if (valuesToSum.get(i) % 2 == 0) {
                sum = sum + valuesToSum.get(i);
                // sum += valuesToSum.get(i);
                System.out.println(valuesToSum.get(i));
            }
        }

        //return 0;
        return sum;
    }
}
