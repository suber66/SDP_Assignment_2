package factorymethod;

public class Skeleton extends Enemy{
    public Skeleton(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void printEnemy() {
        System.out.println("Skeleton with " + health + " health and " + damage + " damage.");
    }

}
