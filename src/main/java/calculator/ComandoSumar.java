package calculator;

import upm.jbb.IO;

public class ComandoSumar extends ComandoG {

    private static final String NAME = "SUMAR";

    public ComandoSumar(Calculadora calc) {
        super(calc, NAME);
    }

    @Override
    public void execute() {
        int valor = IO.in.readInt();
        this.getCalc().sumar(valor);

    }

}
