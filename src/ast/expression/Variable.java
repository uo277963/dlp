package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class Variable extends AbstractASTNode implements Expression {

    private String identifier;

    public Variable(int line, int column, String identifier) {
        super(line, column);
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
