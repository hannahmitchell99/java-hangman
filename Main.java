
public class Main {

    public static void main(String[] args) {

        String word = WordSelector.getWord();
        WordSelector.setHiddenWord();
        System.out.println(WordSelector.getHiddenWord());
        System.out.println(word);
        GameRunning.setName();

        int lives = GameRunning.getLives();
        GameRunning.setIsRunning(true);

        while (lives >= 0 && GameRunning.getIsRunning()) {
            if (lives == 0) {
                WrongGuess.lostGame();
                GameRunning.setIsRunning(false);
            } else {
                Guess.setUserGuess();
                if (word.contains(Guess.getUserGuess())) {
                    System.out.println(RightGuess.setNewHiddenWord(word, Guess.getUserGuess().charAt(0)));
                    if (WordSelector.getHiddenWord().equals(word)) {
                        RightGuess.correctGuess();
                        GameRunning.setIsRunning(false);
                    }
                } else if (lives==1) {
                    WrongGuess.incorrectGuess();
                    GameRunning.setLives();
                    lives = GameRunning.getLives()+1;
                } else {
                    WrongGuess.incorrectGuess();
                    GameRunning.setLives();
                    lives = GameRunning.getLives();
                }
            }
        }
    }

    }

