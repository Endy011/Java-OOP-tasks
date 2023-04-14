package Game.Child.Consumables;

import Game.Parent.Item;

public class Consumable extends Item {
    private boolean consumed;
    private boolean spoiled;

    public Consumable(boolean spoiled) {
        this.spoiled = spoiled;
    }

    public Consumable(String name, int value, double weight, boolean spoiled) {
        super(name, value, weight);
        this.spoiled = spoiled;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public boolean isSpoiled() {
        return spoiled;
    }


    public static String eat() {
        return "You ate food.";
    }

    public static String uses() {   //cant return String when the function name is "use"
        return "You used an item";
    }

    public static boolean isConsumed() {
        return true;
    }

    @Override
    public String toString() {
        return "Consumable{" +
                "consumed=" + consumed +
                ", spoiled=" + spoiled +
                '}';
    }
}
