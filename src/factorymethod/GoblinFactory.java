package factorymethod;

public class GoblinFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Goblin(80, 60);
    }
}
