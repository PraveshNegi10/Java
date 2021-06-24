package OOPS;
class cat{
    boolean furr;
    String breed,color;
    int legs,eyes;
    public void walk()
    {
        System.out.println("Cat is walking:");
    }
    public void eat()
    {
        System.out.println("Cat is eating:");
    }
    public void description()
    {
        System.out.println("My cat has "+legs+" legs and "+eyes+" eyes");
    }

}

public class MainClass {
    public static void main(String[] args)
    {
        cat cat1 = new cat();
        cat cat2 = new cat();
        cat1.legs=3;
        cat1.eyes=2;

        cat1.walk();
        cat2.eat();
        cat1.description();
        cat2.description();

    }
}
