package calculator;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}