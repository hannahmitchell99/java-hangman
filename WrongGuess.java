public class WrongGuess extends Guess{

    static int mistakes;
    public static void incorrectGuess(){
        mistakes ++;
        System.out.println("Whoopsies! Try again");
        System.out.println(WordSelector.getHiddenWord());
        System.out.println(HangmanDisplay.currentHangman(mistakes-1));
        System.out.println("You have "+GameRunning.getLives() + " lives remaining.");
    }

    public static void lostGame(){
        System.out.println("Out of lives! Don't you feel sorry for this poor guy? :( ");
    }
}
