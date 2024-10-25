package animals;

import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal Animal = new Animal();
        System.out.println("Animal:");
        Animal.makeSound();

        Animal dog = new Dog();
        System.out.println("Dog:");
        dog.makeSound();

        Animal cat = new Cat();
        System.out.println("Cat:");
        cat.makeSound();

        scanner.close();
    }
}