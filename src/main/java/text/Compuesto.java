package text;

import java.util.ArrayList;

public abstract class Compuesto extends Componente{

    private ArrayList<Componente> texto;
    
    public Compuesto() {
        this.texto = new ArrayList<Componente>();
    }

    public ArrayList<Componente> getTexto() {
        return this.texto;
    }
    
    @Override
    public void remove (Componente c) {
        this.texto.remove(c);
    }
    
    @Override
    public boolean esCompuesto() {
        return true;
    }
    
    @Override
    public String dibujar(boolean mayus) {
        String text = "";
        for (Componente c : this.texto) {
            text = text + c.dibujar(mayus);
        }
        return text;
    }



}
