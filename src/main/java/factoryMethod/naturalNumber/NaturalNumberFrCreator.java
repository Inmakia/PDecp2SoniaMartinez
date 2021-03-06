package factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberFr(value);
    }

    @Override
    public String toString() {
        return "FR";
    }

}
