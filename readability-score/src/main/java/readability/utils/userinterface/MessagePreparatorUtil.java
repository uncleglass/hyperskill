package readability.utils.userinterface;

import readability.statistics.TextStatistics;

public class MessagePreparatorUtil {
    private MessagePreparatorUtil() {
    }

    public String prepareMessageForTextStatistics(final TextStatistics textStatistics) {
        return "Words: " + textStatistics.getWords() +
                "Sentences: " + textStatistics.getSentences() +
                "Characters: " + textStatistics.getCharacters() +
                "The score is: " + String.format("%.2f", textStatistics.getReadabilityIndex());
    }
}
