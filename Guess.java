import java.util.ArrayList;
import java.util.Scanner;

public class Guess{

    private static String userGuess;
    private static ArrayList<String> pastGuesses = new ArrayList<>();

    public Guess() {
    }

    public static ArrayList<String> getPastGuesses() {
        return pastGuesses;
    }

    public void setPastGuesses(ArrayList<String> pastGuesses) {
        this.pastGuesses = pastGuesses;
    }

    public static String getUserGuess() {
        return userGuess.toLowerCase();
    }

    public static void setUserGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a letter :) ");
        userGuess = scanner.nextLine();
        while(userGuess.length()!=1){
            System.out.println("Enter only a single letter, please!");
            userGuess = scanner.nextLine();
        }
        while(pastGuesses.contains(userGuess)) {
            System.out.println("Enter a letter you haven't used before!");
            userGuess = scanner.nextLine();
        }
        pastGuesses.add(userGuess.toLowerCase());
        System.out.println("You have guessed the following: " + pastGuesses);
    }


}
