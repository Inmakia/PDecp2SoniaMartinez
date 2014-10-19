package composite.expression;

public abstract class Operacion extends Expresion {

    private Expresion subExpression1, subExpression2;
    
    public Operacion(Expresion subExp1, Expresion subExp2) {
        this.subExpression1 = subExp1;
        this.subExpression2 = subExp2;
    }

    public Expresion getSubExpression1() {
        return this.subExpression1;
    }

    public Expresion getSubExpression2() {
        return this.subExpression2;
    }
    
    

}
