package readability.utils.userinterface;

import readability.statistics.TextStatistics;
import readability.utils.index.ReadabilityIndexUtil;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MessagePreparatorUtil {
    private static DecimalFormat format = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US));

    private MessagePreparatorUtil() {
    }

    public static String prepareMessageForTextStatistics(final TextStatistics textStatistics) {
        return "Words: " + textStatistics.getWords() +
                "\nSentences: " + textStatistics.getSentences() +
                "\nCharacters: " + textStatistics.getCharacters() +
                "\nThe score is: " + format.format( textStatistics.getReadabilityIndex()) +
                "\nThis text should be understood by " +
                ReadabilityIndexUtil.getApproximateAge(textStatistics.getReadabilityIndex()) +
                " year olds.";
    }

    public static String prepareMessageForText(final String text) {
        return "The text is:\n" + text + "\n";
    }
}
