package Enums;

public enum Coffee {
    S("Small", 5),
    M("Medium", 8),
    L("Large", 10);

    String size;
    int cost;

    Coffee(String size, int cost) {
        this.size = size;
        this.cost = cost;
    }
}
