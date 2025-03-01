package Lesson_8;

import java.util.*;

public class ArrayOfWords {
    public static void main (String [] args) {
        String[] words = {
                "крокодил", "бегемот","кашалот", "бегемот", "зебра", "лев", "крокодил", "лев",
                "кашалот", "крокодил", "бегемот", "попугай", "бегемот", "лев", "лев", "лев"
        };

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            Integer count = wordCount.get(word);
            if (count == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, count + 1);
            }
        }
        System.out.println("Сколько раз встречается каждое слово:" + wordCount);

        List<String> uniqueWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }
        System.out.println("Уникальные слова: " + uniqueWords);

    }
}