package composite.expression;

public class Dividir extends Operacion {

    public Dividir(Expresion subExp1, Expresion subExp2) {
        super(subExp1, subExp2);
    }

    @Override
    public int operar() {
        return this.getSubExpression1().operar() / this.getSubExpression2().operar();
    }
    
    @Override
    public String toString() {
        return "(" + this.getSubExpression1().toString() + "/" + this.getSubExpression2().toString() + ")";
    }
}
