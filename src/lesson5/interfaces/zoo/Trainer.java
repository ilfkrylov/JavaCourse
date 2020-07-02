package lesson5.interfaces.zoo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Trainer {
    public void printVoice(Voice hasVoice) {
        String s = hasVoice.voice();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Puppy puppy = new Puppy();
        Duck duck = new Duck();
        Fish fish = new Fish();
        List list = new ArrayList<>();
        List list2 = new LinkedList();
        Trainer trainer = new Trainer();
        trainer.printVoice(dog);
        trainer.printVoice(duck);
        trainer.printVoice(puppy);
       // trainer.printVoice(fish);
    }
}
