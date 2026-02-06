package org.practiceAnswers.StanislawHolovnevAnswers.helpers;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    public static List<Integer> readFile(String path) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get(path));

        for (String line : lines) {
            String[] parts = line.split(",");

            for (String part : parts) {
                String cleanPart = part.trim();
                if (!cleanPart.isEmpty()) {
                    numbers.add(Integer.parseInt(cleanPart));
                }
            }
        }

        return numbers;
    }

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        if (src == null || dest == null) {
            return;
        }
        if (dest.size() < src.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest: " +
                    "dest.size=" + dest.size() + ", src.size=" + src.size());
        }
        for (int i = 0; i < src.size(); i++) {
            dest.set(i, src.get(i));
        }
        System.out.println("Элементы успешно перезаписаны в dest: " + dest);
    }
}
