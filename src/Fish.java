public class Fish extends Animal implements Swimmable {

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void makeSound() {
        System.out.println("fish");
    }

    public void eat() {
        System.out.println("I eat fish");

    }

    public void sleep() {
        System.out.println("I sleep fish");

    }

    public void swim() {
        System.out.println("I swim");
    }

    public void feed(){
        System.out.println("I eat");
    }

    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
}

