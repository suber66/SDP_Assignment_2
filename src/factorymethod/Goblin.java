package factorymethod;

public class Goblin extends Enemy{
    public Goblin(int health, int damage) {
        super(health, damage);
    }
    @Override
    public void printEnemy() {
        System.out.println("Goblin with " + health + " health and " + damage + " damage.");
    }
}
