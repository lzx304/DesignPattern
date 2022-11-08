package com.lzx.interpreter;

import java.util.HashMap;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 16:50:14
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    //因为 SymbolExpression 是让其子类来实现，因此 interpreter 是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
// TODO Auto-generated method stub
        return 0;
    }
}
