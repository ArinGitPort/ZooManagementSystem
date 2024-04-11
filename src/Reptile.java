public class Reptile extends Animal {

    public Reptile(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void makeSound() {
        System.out.println("sssshhh");
    }

    public void eat() {
        System.out.println("I eat reptile");

    }

    public void sleep() {
        System.out.println("I sleep reptile");

    }
}
