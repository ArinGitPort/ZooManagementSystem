public class Bird extends Animal implements Flyable {

    public Bird(String name, int age, double weight){
        super(name, age, weight);
    }

    public void makeSound() {
        System.out.println("chirp");
    }

    public void eat() {
        System.out.println("I eat bird");

    }

    public void sleep() {
        System.out.println("I sleep bird");

    }

    public void fly() {
        System.out.println("I fly");
    }
}
