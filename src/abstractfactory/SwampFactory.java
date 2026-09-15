package abstractfactory;

public class SwampFactory implements AbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Skeleton();
    }

    @Override
    public Biome createBiome() {
        return new Swamp();
    }
}
