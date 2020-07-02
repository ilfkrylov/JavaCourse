package lesson5.interfaces.zoo;

public class Duck extends Bird implements Fly, Voice {
    @Override
    String getEgg() {
        return "утиное";
    }

    @Override
    public void fly() {
        System.out.println("утка летит");
    }

    @Override
    public String voice() {
        return "кря";
    }
}
