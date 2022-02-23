package com.careerdevs;

import java.util.ArrayList;

public class WordGuesser {

    public static String[] playableWords = new String[] {
            "guessing", "these", "words",
            "is", "very", "easy"
    };

    //This will store total number of guesses during round.
    public static int guessesMade;
    //Need to figure out way to present current word as blank spaces
    //using this to test.
    public static String currentWord = "easy";
    //Im thinking... using a replace?
    public static String wordHidden = currentWord.replaceAll("\\S", "_");
    //This will store guesses for current round.
    public static ArrayList<Character> lettersGuessed = new ArrayList<>();


    public static void wordGuesser() {





    }

    public static void currentRoundSummary() {
        System.out.println("Guesses made:" + guessesMade);
        System.out.println("Word:" + wordHidden);
        System.out.println("Guesses:" + lettersGuessed);
    }

}
