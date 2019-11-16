package readability.statistics;

import readability.utils.index.ReadabilityIndexUtil;

public class TextStatistics {
    private final int characters;
    private final int words;
    private final int sentences;

    public TextStatistics(int characters, int words, int sentences) {
        this.characters = characters;
        this.words = words;
        this.sentences = sentences;
    }

    public double getReadabilityIndex() {
        return ReadabilityIndexUtil.countReadabilityIndex(this);
    }

    public int getCharacters() {
        return characters;
    }

    public int getWords() {
        return words;
    }

    public int getSentences() {
        return sentences;
    }
}
