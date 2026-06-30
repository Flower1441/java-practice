import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    String cleanWord = word.trim().toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (cleanWord.isEmpty()) {
                        continue;
                    }

                    addWord(wordCount, cleanWord);
                }
            }

            for (String word : wordCount.keySet()) {
                System.out.println(word + ":" + wordCount.get(word));
            }
        } catch (IOException e) {
            System.out.println("Error in reading the file" + e.getMessage());
        }
    }

    public static void addWord(HashMap<String, Integer> wordCount, String cleanWord) {
        if (wordCount.containsKey(cleanWord)) {
            int cur = wordCount.get(cleanWord);
            wordCount.put(cleanWord, cur + 1);
        } else {
            wordCount.put(cleanWord, 1);
        }
    }
}
