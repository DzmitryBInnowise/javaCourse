package org.practiceAnswers.StanislawHolovnevAnswers.helpers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionHelpers {

    public static void useMapWithSumOfNumbers(Map<String, List<Integer>> map) {
        int sum = 0;
        for (List<Integer> numbers : map.values()) {
            for (int number : numbers) {
                sum += number;
            }
        }
        System.out.println("Sum of all numbers in map: " + sum);
    }

    public static void printNumbers(List <? extends Number> numbers) {
        for(Number number : numbers) {
            System.out.printf("Numbers is: " + number + ", ");
        }
    }

    public static List<Integer> readNCopy(String path) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");

                for (String token : tokens) {
                    String trimmed = token.trim();
                    if (!trimmed.isEmpty()) {
                        numbers.add(Integer.parseInt(trimmed));
                    }
                }
            }
        }
        return numbers;
    }

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        if (src == null || dest == null) {
            return;
        }
        for (T element : src) {
            dest.add(element);
        }
        System.out.println("Элементы скопированы : " + dest);
    }
}
