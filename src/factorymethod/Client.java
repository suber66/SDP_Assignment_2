package factorymethod;

public class Client {
    public static void main(String[] args) {
        EnemyFactory goblin_factory = new GoblinFactory();
        EnemyFactory skeleton_factory = new SkeletonFactory();
        EnemyFactory slime_factory = new SlimeFactory();

        goblin_factory.showEnemy();
        skeleton_factory.showEnemy();
        slime_factory.showEnemy();
    }
}
