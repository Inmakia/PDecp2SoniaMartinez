package text;

public abstract class Componente {

    public abstract void add(Componente c);
    public abstract void remove(Componente c);
    public abstract boolean esCompuesto();
    public abstract String dibujar(boolean mayus);


}
