package ua.uni;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract public class Animal {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void second() {
        Animal a = new Dog();
        Animal b = new Cat();
        if (a instanceof Dog dog) {
            dog = dog.fetchStick();
        }
        else {
            System.out.println("It is not a Dog");
        }
        if (b instanceof Dog dog2) {
            dog2 = dog2.fetchStick();
        }
        else {
            System.out.println("It is not a Dog");

        }
    }

    private static void first() {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    public abstract void speak();
}