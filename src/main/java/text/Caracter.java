package text;

public class Caracter extends Componente {
    
    private char c;

    public Caracter(char c) {
        this.c = c;
    }

    @Override
    public void add(Componente h) {
    }

    @Override
    public void remove(Componente h) {     
    }

    @Override
    public boolean esCompuesto() {
        return false;
    }

    @Override
    public String dibujar(boolean mayus) {
        if(mayus){
            return ("" + c).toUpperCase();
        }
        return "" + c;
    }


}
