package animals;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats meat.");
    }

    @Override
    public void bark() {
        System.out.println("Dog => Woof.");
    }
}
