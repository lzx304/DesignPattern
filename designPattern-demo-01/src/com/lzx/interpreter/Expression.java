package com.lzx.interpreter;

import java.util.HashMap;

/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/11/6 17:12:08
 */
public abstract class Expression {
    // a + b - c
// 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value 就是就是具体值
// HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
