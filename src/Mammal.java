public class Mammal extends Animal {

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void makeSound() {
        System.out.println("RAWR");
    }

    public void eat() {
        System.out.println("I eat mammal");

    }

    public void sleep() {
        System.out.println("I sleep mammal");

    }
}
