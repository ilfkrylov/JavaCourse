package lesson3.inheritance.improve;

public class App {
    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus();
        pegasus.fly();
        pegasus.voice();

        Horse horse = new Horse();
        horse.voice();

        Horse pegas = new Pegasus();
        pegas.voice();
        // pegas.fly(); // нельзя
        if (pegas instanceof Pegasus)
            ((Pegasus) pegas).fly(); // можно
    }
}
