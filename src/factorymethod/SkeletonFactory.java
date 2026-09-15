package factorymethod;

public class SkeletonFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Skeleton(150, 40);
    }
}
