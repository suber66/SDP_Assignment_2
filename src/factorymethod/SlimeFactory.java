package factorymethod;

public class SlimeFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Slime(100, 20);
    }
}
