import java.util.ArrayList;
import java.util.Random;

public class WordSelector {
    private static String word;
    private static Random random = new Random();
    private static String hiddenWord = "";

    public static String getWord() {
        word = WordLibrary.wordArr.get(random.nextInt(WordLibrary.wordArr.size()));
        return word;
    }

    public static String getHiddenWord() {
        return hiddenWord;
    }

    public static String setHiddenWord() {
        for (int i = 0; i < word.length(); i++) {
            hiddenWord += "_";
        }
        return hiddenWord;
    }

    public static void changeHiddenWord(char userGuess, int index){
        char[] charArr = hiddenWord.toCharArray();
        charArr[index] = userGuess;
        hiddenWord = String.valueOf(charArr);
        System.out.println(hiddenWord);
    }

}
