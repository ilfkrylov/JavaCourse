package lesson5.interfaces.zoo;

public interface Fly {
    default void fly() {
        System.out.println("оно летит");
    }
}
