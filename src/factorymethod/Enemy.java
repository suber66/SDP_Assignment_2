package factorymethod;

public abstract class Enemy {
    int health,damage;
    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public abstract void printEnemy();
}
