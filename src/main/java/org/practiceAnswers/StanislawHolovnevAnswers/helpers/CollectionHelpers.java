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

}
