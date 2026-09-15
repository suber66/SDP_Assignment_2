package factorymethod;

abstract public class EnemyFactory {
    abstract Enemy createEnemy();
    void showEnemy() {
        createEnemy().printEnemy();
    }
}
