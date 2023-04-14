package Game.Parent;

public class Item {
    private int numberOfItems;
    private int id;
    private int value;
    private String name;
    private double weight;

    public Item() {

    }

    public Item(String name, int value, double weight) {
        this.name = name;
        this.value = value;
        this.weight = weight;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void use(){

    };

    public static int compareTo(){

        return 0;
    }

    public static void reset() {

    }

    @Override
    public String toString() {
        return "Item{" +
                "numberOfItems=" + numberOfItems +
                ", id=" + id +
                ", value=" + value +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}
