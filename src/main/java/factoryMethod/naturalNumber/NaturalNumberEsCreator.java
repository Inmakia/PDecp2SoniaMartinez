package factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberEs(value);
    }

    @Override
    public String toString() {
        return "ES";
    }

}
