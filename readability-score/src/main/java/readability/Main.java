package readability;

import readability.statistics.TextStatistics;
import readability.utils.file.ReaderUtil;

import static readability.utils.parser.ParserUtil.parseToStatistics;
import static readability.utils.userinterface.MessagePreparatorUtil.prepareMessageForText;
import static readability.utils.userinterface.MessagePreparatorUtil.prepareMessageForTextStatistics;
import static readability.utils.userinterface.UserInterfaceUtil.print;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
                String text = ReaderUtil.readFile(args[0]);
                print(prepareMessageForText(text));
                TextStatistics textStatistics = parseToStatistics(text);
                print(prepareMessageForTextStatistics(textStatistics));
        }
    }
}
