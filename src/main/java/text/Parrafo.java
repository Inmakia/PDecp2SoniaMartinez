package text;

public class Parrafo extends Compuesto {

    public Parrafo() {
    }

    @Override
    public void add(Componente c) {
        if (c.esCompuesto()) {
            throw new UnsupportedOperationException();
        }
        this.getTexto().add(c);
    }

    @Override
    public String dibujar(boolean mayus) {
        return super.dibujar(mayus) + "\n";
    }

}
