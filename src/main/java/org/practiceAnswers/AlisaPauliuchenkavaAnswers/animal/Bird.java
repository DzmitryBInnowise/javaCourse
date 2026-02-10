package org.practiceAnswers.AlisaPauliuchenkavaAnswers.animal;

import org.practiceAnswers.AlisaPauliuchenkavaAnswers.interfaces.Flyable;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("птица летит");
    }
}
