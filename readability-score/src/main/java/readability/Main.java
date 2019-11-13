package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] sentences = line.split("[.!?]");
        double wordsCounter = 0;
        for (String sentence : sentences) {
            String[] words = sentence.trim().split(" ");
            wordsCounter += words.length;
        }
        double averageWord = wordsCounter / sentences.length;

        System.out.println(averageWord > 10.0 ? "HARD" : "EASY");
    }
}
