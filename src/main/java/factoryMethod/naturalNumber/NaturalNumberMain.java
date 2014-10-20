package factoryMethod.naturalNumber;

import upm.jbb.IO;

public class NaturalNumberMain {
    private NaturalNumberCreator[] creadores = {new NaturalNumberEsCreator(), new NaturalNumberEnCreator(), new NaturalNumberFrCreator()};

    private NaturalNumberCreator creador = creadores[0];

    public void tipoCreador() {
        this.creador = (NaturalNumberCreator) IO.in.select(creadores, "Elige un creador");
    }

    public void crearProducto() {
        IO.out.println("Creado producto: " + this.creador.createNumber(0).getTextValue());
        IO.out.println("Creado producto: " + this.creador.createNumber(1).getTextValue());
        IO.out.println("Creado producto: " + this.creador.createNumber(2).getTextValue());
        IO.out.println("Creado producto: " + this.creador.createNumber(3).getTextValue());
        IO.out.println("Creado producto: " + this.creador.createNumber(4).getTextValue());
        IO.out.println("Creado producto: " + this.creador.createNumber(5).getTextValue());
    }

    public static void main(String[] args) {
        IO.in.addController(new NaturalNumberMain());
    }
}
