package readability.statistics;

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
        return 4.71 * ((double) characters / words) + 0.5 * ((double) words / sentences) - 21.43;
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
