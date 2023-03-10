public class HangmanDisplay {

    private static String[] hangmanPics ={
    "  +---+\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  0   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
            "  |   |\n" +
            "  0   |\n" +
            " /|/  |\n" +
            "      |\n" +
            "      |\n" +
            "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  0   |\n" +
                    " /|/  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  0   |\n" +
                    " /|/  |\n" +
                    " / /  |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  xx  |\n" +
                    " /|/  |\n" +
                    " / /  |\n" +
                    "      |\n" +
                    "========="
    };

    public static String[] getHangmanPics() {
        return hangmanPics;
    }

    public static void setHangmanPics(String[] hangmanPics) {
        HangmanDisplay.hangmanPics = hangmanPics;
    }

    public static String currentHangman(int lives){
        return hangmanPics[lives];
    }
}
