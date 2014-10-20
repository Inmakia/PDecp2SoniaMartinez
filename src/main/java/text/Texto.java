package text;

public class Texto extends Compuesto {

    public Texto() {
    }

    @Override
    public void add(Componente c) {
        if (!c.esCompuesto()) {
            throw new UnsupportedOperationException();
        }
        this.getTexto().add(c);
    }
    
    @Override
    public String dibujar(boolean mayus) {
        return super.dibujar(mayus) + "---o---\n";
    }

}
