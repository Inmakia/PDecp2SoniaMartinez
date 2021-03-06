package factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {
    
    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberEn(value);
    }
    
    @Override
    public String toString() {
        return "EN";
    }

}
