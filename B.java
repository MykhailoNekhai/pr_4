package ua.uni;

public class B extends A {
    @Override
    public void process(Object object){
        System.out.println(" B object: "+object);

    }
    //overload
    public void process(String string){
        System.out.println("string: " + string);

    }
}
