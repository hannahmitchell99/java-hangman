
public class RightGuess extends Guess{

    private static String newHiddenWord = "";

    public static String setNewHiddenWord(String word, char userGuess){

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == userGuess){
                WordSelector.changeHiddenWord(userGuess, i);
            }
        }
        return newHiddenWord;
    }
    public static void correctGuess(){
        System.out.println("You guessed the word, and saved him! Well done");
    }

}
