import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List <String> lines= Files.readAllLines(Paths.get("input.txt"));
            ArrayList <String> words = new ArrayList<>();
            for (String line : lines) {
                words.addAll(Arrays.asList(line.split("\\s")));
            }
            Collections.sort(words);
            System.out.println("Сортировка в афавитном порядке:");
            for (String word : words) {
                System.out.println("\t" + word);
            }
            Map<String, Integer> countWords = new HashMap<>();
            for (String word : words) {
                Integer count = countWords.get(word);
                if (count == null) {
                    count = 0;
                }
                countWords.put(word, count +1);
            }
            System.out.print("\nКоличество повторений: \n\t");
            for(Map.Entry<String, Integer> entry: countWords.entrySet())
                System.out.print(entry.getKey() + " - " + entry.getValue() + " ");

           Collections.sort(words, new Comparator<String>() {
                @Override
                public int compare(String key1, String key2) {
                    return countWords.get(key2).compareTo(countWords.get(key1));
                }
            });
            System.out.print("\n\nСлово с максималным количеством повторений: \n\t");
            System.out.println( words.get(0) + " = " + countWords.get(words.get(0)) + "\n");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}