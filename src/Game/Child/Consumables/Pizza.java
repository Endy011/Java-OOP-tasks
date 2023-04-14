package Game.Child.Consumables;

public class Pizza extends Consumable{
    private int numberOfSlices;
    private int slicesEaten;

    public Pizza(String name, int value, double weight, boolean spoiled, int numberOfSlices) {
        super("Pizza", 2, 0.3, spoiled);
        this.numberOfSlices = numberOfSlices;
    }

    public Pizza(int numberOfSlices, boolean spoiled) {
        super(spoiled);                                         //ask about this part
        this.numberOfSlices = numberOfSlices;                   //create a constructor with only spoiled
    }

    public static String eat() {
        return "You ate the pizza";
    }
}
