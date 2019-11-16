package readability.utils.parser;

import readability.statistics.TextStatistics;

public class ParserUtil {
    private ParserUtil() {
    }

    public static TextStatistics parseToStatistics(final String text) {
        return new TextStatistics(0,0,0);
    }
}
