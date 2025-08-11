class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}


