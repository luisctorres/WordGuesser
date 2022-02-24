package com.careerdevs;

import java.util.ArrayList;

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
        //Take current word and makes a char array.
        char[] currentWordAsCharacters = currentWord.toCharArray();
        //initialize wordHidden Arraylist
        ArrayList<Character> wordHidden = new ArrayList<>();

        //this loop takes current word and makes a hidden (underscore version)
        for (int i = 0; i < currentWordAsCharacters.length; i++) {
            //converts current letter to string to allow replaceAll() method
            String currentLetter = String.valueOf(currentWordAsCharacters[i]);
            //this replaces letter with an underscore
            String stringToUnderscore = currentLetter.replaceAll("\\S", "_");
            //adds it to wordHidden Arraylist
            wordHidden.add(stringToUnderscore.charAt(0));
            //adds a space in between characters
            wordHidden.add(' ');
            //resets currentLetterBeingReplaced
            currentLetter = "";

        }
        System.out.println(wordHidden);

        //currentWord.replaceAll("\\S", "_");

        //This will store guesses for current round.

    }

    public static void currentRoundSummary() {
        System.out.println("Guesses made:" + guessesMade);
        System.out.println("Word:" );
        System.out.println("Guesses:" + lettersGuessed);
    }

}
