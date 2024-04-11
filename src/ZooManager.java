import java.util.Scanner;
import java.util.ArrayList;

public class ZooManager {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("Zoo Management System Menu:");
            System.out.println("1. Add Animal");
            System.out.println("2. View all animals in the zoo");
            System.out.println("3. Feed animals");
            System.out.println("4. Simulate animal behavior");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addAnimal(animals, scan);
                    break;
                case 2:
                    displayAnimals(animals);
                    break;
                case 3:
                    feedAnimals(animals);
                    break;
                case 4:
                    simulateAnimalBehavior(animals);
                    break;
                case 5:
                    System.out.println("Exiting Zoo Management System. Goodbye!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addAnimal(ArrayList<Animal> animals, Scanner scan) {
        // Prompt user for animal details
        System.out.println("Enter the type of animal (Mammal, Bird, Reptile, Fish):");
        String animalType = scan.nextLine();

        System.out.println("Enter the name of the animal:");
        String name = scan.nextLine();

        System.out.println("Enter the age of the animal:");
        int age = scan.nextInt();

        System.out.println("Enter the weight of the animal:");
        double weight = scan.nextDouble();
        scan.nextLine(); // Consume newline

        switch (animalType.toLowerCase()) {
            case "mammal":
                Mammal mammal = new Mammal(name, age, weight);
                mammal.makeSound();
                mammal.eat();
                mammal.sleep();
                animals.add(mammal);
                break;
            case "bird":
                Bird bird = new Bird(name, age, weight);
                bird.makeSound();
                bird.eat();
                bird.fly();
                bird.sleep();
                animals.add(bird);
                break;
            case "reptile":
                Reptile reptile = new Reptile(name, age, weight);
                reptile.makeSound();
                reptile.eat();
                reptile.sleep();
                animals.add(reptile);
                break;
            case "fish":
                Fish fish = new Fish(name, age, weight);
                fish.eat();
                fish.sleep();
                fish.swim();
                animals.add(fish);
                break;
            default:
                System.out.println("Invalid animal type.");
        }
    }

    private static void displayAnimals(ArrayList<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            System.out.println("All animals in the zoo:");
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }

    private static void feedAnimals(ArrayList<Animal> animals) {
        System.out.println("Feeding animals...");
        // Implement feeding logic here
    }

    private static void simulateAnimalBehavior(ArrayList<Animal> animals) {
        System.out.println("Simulating animal behavior...");
        // Implement simulation logic here
    }
}
