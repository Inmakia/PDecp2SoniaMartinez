package calculator;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoG {
    private static final String NAME = "DESHACER";

    private GestorMementos<MementoCalculadora> gestor;

    public ComandoDeshacer(Calculadora calc, GestorMementos<MementoCalculadora> gestor) {
        super(calc, NAME);
        this.gestor = gestor;
    }

    @Override
    public void execute() {
        ((CalculadoraMementable) this.getCalc()).restoreMemento(this.gestor
                .getMemento((String) IO.in.select(gestor.keys(), "Restaurar")));
    }

}
