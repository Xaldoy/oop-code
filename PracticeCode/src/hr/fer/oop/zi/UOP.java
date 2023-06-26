package hr.fer.oop.zi;

import java.util.function.UnaryOperator;

public class UOP<T extends Number> implements UnaryOperator<T>{

	@SuppressWarnings("unchecked")
	@Override
	public T apply(T t) {
		if(t instanceof Integer)
			return (T) Integer.valueOf(t.intValue() + 1);
		return t;
	}

}
