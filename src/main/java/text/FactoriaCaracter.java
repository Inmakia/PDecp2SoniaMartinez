package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

    private static FactoriaCaracter factory;
    private Map<Character, Caracter> chars;

    private FactoriaCaracter() {
        this.chars = new HashMap<Character, Caracter>();
    }
    
    public static FactoriaCaracter getFactoria(){
        if (factory == null) {
            factory = new FactoriaCaracter();
        }
        return factory;
    }

    public Caracter get(char c) {
      if(!this.chars.containsKey(c)){
          this.chars.put(c, new Caracter(c));
      }
        return this.chars.get(c);
    }
}
