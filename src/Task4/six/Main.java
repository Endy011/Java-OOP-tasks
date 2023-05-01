package Task4.six;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Catto");
        Dog dog = new Dog("Doggo");
        Dog dog1 = new Dog("Doge");
        System.out.println(cat.toString());
        cat.greets();
        System.out.println(dog.toString());
        dog.greets();
        dog.greets(dog1);
    }
}
