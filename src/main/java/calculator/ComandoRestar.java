package calculator;

import upm.jbb.IO;

public class ComandoRestar extends ComandoG {

    private static final String NAME = "RESTAR";

    public ComandoRestar(Calculadora calc) {
        super(calc, NAME);
    }

    @Override
    public void execute() {
        int valor = IO.in.readInt();
        this.getCalc().restar(valor);
    }

}
