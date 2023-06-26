package hr.fer.oop.zi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class DigitIterator implements Iterator<Integer> {

	private int expOf10;
	private int num;

	public DigitIterator(int num) {
		this.num = num;
		expOf10 = (int) Math.pow(10, (int) Math.log10(num));
	}

	@Override
	public boolean hasNext() {
		return num > 0;
	}

	@Override
	public Integer next() {
		
		IsOdd is = new IsOdd();
		
		if (hasNext()) {
			int digit = num / expOf10;
			num %= expOf10;
			expOf10 /= 10;
			if(is.test(num))
			return digit;
			else return null;
		}
		else throw new NoSuchElementException("No more digits");
	}
	
	class IsOdd implements Predicate<Integer> {
		@Override
		public boolean test(Integer t) {
			if(t%2!=0) return true;
			return false;
		}
		
	}

}
