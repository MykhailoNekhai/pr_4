package ua.uni;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("I'm a dog");
    }
    public Dog fetchStick(){
        System.out.println("Dog fetching stick");
        return null;
    }
}
