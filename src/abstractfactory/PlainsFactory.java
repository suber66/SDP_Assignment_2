package abstractfactory;

public class PlainsFactory implements AbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }

    @Override
    public Biome createBiome() {
        return new Plains();
    }
}
