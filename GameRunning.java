import java.util.Scanner;

public class GameRunning {

    private static String name;
    private static boolean isRunning;

    private static int lives = 5;

    public static int getLives() {
        return lives;
    }

    public static int setLives() {
        return lives --;
    }

    public static boolean getIsRunning() {
        return isRunning;
    }

    public static boolean setIsRunning(boolean startGame) {
        if(startGame){
            return isRunning= true;
        } else {
            return isRunning=false;
        }

    }

    public static String getName() {
        return name;
    }

    public static void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Welcome to Hangman ! Please enter your name!");
        name = scanner.nextLine();
        System.out.println("Welcome, "+ name+"! Your word has been selected");
    }

}
