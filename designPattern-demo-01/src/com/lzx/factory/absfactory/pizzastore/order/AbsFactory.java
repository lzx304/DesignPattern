package com.lzx.factory.absfactory.pizzastore.order;


import com.lzx.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
	 Pizza createPizza(String orderType);
}
