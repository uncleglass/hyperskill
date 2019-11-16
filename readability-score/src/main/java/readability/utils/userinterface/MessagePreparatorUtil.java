package readability.utils.userinterface;

import readability.statistics.TextStatistics;
import readability.utils.index.ReadabilityIndexUtil;

public class MessagePreparatorUtil {
    private MessagePreparatorUtil() {
    }

    public static String prepareMessageForTextStatistics(final TextStatistics textStatistics) {
        return "Words: " + textStatistics.getWords() +
                "\nSentences: " + textStatistics.getSentences() +
                "\nCharacters: " + textStatistics.getCharacters() +
                "\nThe score is: " + String.format("%.2f", textStatistics.getReadabilityIndex())+
                "\nThis text should be understood by " +
                ReadabilityIndexUtil.getApproximateAge(textStatistics.getReadabilityIndex())+
                " year olds.";
    }


}
