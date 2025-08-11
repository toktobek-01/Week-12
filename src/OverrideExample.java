public class OverrideExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Parent class object
        Animal myDog = new Dog();      // Parent reference, child object

        myAnimal.makeSound(); // Calls Animal's method
        myDog.makeSound();    // Calls Dog's overridden method
    }
}
