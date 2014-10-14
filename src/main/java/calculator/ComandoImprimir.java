package calculator;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoG {

    private static final String NAME = "IMPRIMIR";

    public ComandoImprimir(Calculadora calc) {
        super(calc, NAME);
    }

    @Override
    public void execute() {
        IO.out.println(this.getCalc().getTotal());

    }

}
