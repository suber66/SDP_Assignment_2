package abstractfactory;

public class EnvironmentClient {
    private Enemy enemy;
    private Biome biome;
    public EnvironmentClient(AbstractFactory factory) {
        enemy = factory.createEnemy();
        biome = factory.createBiome();
    }
    public void show() {
        enemy.check();
        biome.show();
    }
}
