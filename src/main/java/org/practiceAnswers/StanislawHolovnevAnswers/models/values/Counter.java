package org.practiceAnswers.StanislawHolovnevAnswers.models.values;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }
}
