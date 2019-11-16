package readability.utils.parser;

import readability.statistics.TextStatistics;

public class ParserUtil {
    private ParserUtil() {
    }

    public static TextStatistics parseToStatistics(final String text) {
        String[] sentencesArray = text.split("[.!?]");
        int wordsCounter = 0;
        for (String sentence : sentencesArray) {
            String[] words = sentence.trim().split(" ");
            wordsCounter += words.length;
        }
        int characterCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isWhitespace(text.charAt(i))) {
                characterCounter++;
            }
        }
        return new TextStatistics(characterCounter,wordsCounter,sentencesArray.length);
    }
}
