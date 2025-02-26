import java.util.Scanner;

public class WordCounter {

    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        return sentence;
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0; // Handle empty or null input
        }
        String[] words = sentence.split("\\s+"); // Split by one or more spaces
        return words.length;
    }

    public static void main(String[] args) {
        String inputSentence = getSentenceInput();
        int wordCount = countWords(inputSentence);
        System.out.println("Word count: " + wordCount);
    }
}		
