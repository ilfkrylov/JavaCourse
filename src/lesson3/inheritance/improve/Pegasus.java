package lesson3.inheritance.improve;

public class Pegasus extends Horse {
    Wings wings;

    public void fly() {

    }

    @Override
    public void voice() {
        System.out.print("пегас унаследован от ");
        super.voice();
    }
}
