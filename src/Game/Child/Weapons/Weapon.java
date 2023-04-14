package Game.Child.Weapons;

import Game.Parent.Item;

public class Weapon extends Item {
    private double MODIFIER_CHANGE_RATE = 0.05;
    private double baseDamage;
    private double damageModifier;
    private double baseDurability;
    private double durabilityModifier;

    public Weapon(String name, int value, double weight, double baseDamage, double baseDurability) {
        super(name, value, weight);
        this.baseDamage = baseDamage;
        this.baseDurability = baseDurability;
    }

    public double getMODIFIER_CHANGE_RATE() {
        return MODIFIER_CHANGE_RATE;
    }

    public void setMODIFIER_CHANGE_RATE(double MODIFIER_CHANGE_RATE) {
        this.MODIFIER_CHANGE_RATE = MODIFIER_CHANGE_RATE;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }

    public double getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(double damageModifier) {
        this.damageModifier = damageModifier;
    }

    public double getBaseDurability() {
        return baseDurability;
    }

    public void setBaseDurability(double baseDurability) {
        this.baseDurability = baseDurability;
    }

    public double getDurabilityModifier() {
        return durabilityModifier;
    }

    public void setDurabilityModifier(double durabilityModifier) {
        this.durabilityModifier = durabilityModifier;
    }

    public static void polish(){

    }

    @Override
    public String toString() {
        return "Weapon{" +
                "MODIFIER_CHANGE_RATE=" + MODIFIER_CHANGE_RATE +
                ", baseDamage=" + baseDamage +
                ", damageModifier=" + damageModifier +
                ", baseDurability=" + baseDurability +
                ", durabilityModifier=" + durabilityModifier +
                '}';
    }
}
