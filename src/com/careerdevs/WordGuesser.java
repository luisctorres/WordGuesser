package com.careerdevs;

import java.util.ArrayList;
import java.util.Arrays;

public class WordGuesser {

    public static String[] playableWords = new String[] {
            "guessing", "these", "words",
            "is", "very", "easy"
    };

    //This will store total number of guesses during round.
    public static int guessesMade;
   //This will store each letter guessed.
    public static ArrayList<Character> lettersGuessed = new ArrayList<>();


    public static void wordGuesser() {
        newWord();
        currentRoundSummary();



    }

    public static void newWord() {

        String currentWord = "easy";
        char[] currentWordAsCharacters = currentWord.toCharArray();
        ArrayList<Character> wordHidden = new ArrayList<>();

        for (int i = 0; i < currentWordAsCharacters.length; i++) {
            wordHidden.add(i, currentWordAsCharacters[i]);
            wordHidden.add(i, ' ');
        }
        System.out.println(wordHidden);
        //currentWord.replaceAll("\\S", "_");

        //This will store guesses for current round.

    }

    public static void currentRoundSummary() {
        System.out.println("Guesses made:" + guessesMade);
        System.out.println("Word:");
        System.out.println("Guesses:" + lettersGuessed);
    }

}
