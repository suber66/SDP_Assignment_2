package factorymethod;

public class Slime extends Enemy{

    public Slime(int health, int damage) {
        super(health, damage);
    }
    @Override
    public void printEnemy() {
        System.out.println("Slime with " + health + " health and " + damage + " damage.");
    }
}
