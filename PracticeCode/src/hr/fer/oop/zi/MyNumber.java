package hr.fer.oop.zi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MyNumber implements Iterable<Integer> {

	private int num;

	public MyNumber(int num) {
		this.num = num;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new DigIterator();
	}

	class DigIterator implements Iterator<Integer> {

		private int num;
		private int expOf10;

		public DigIterator() {
			this.num = MyNumber.this.num;
			this.expOf10 = (int) Math.pow(10, (int) Math.log10(num));
		}

		@Override
		public boolean hasNext() {
			return num > 0;
		}

		@Override
		public Integer next() {

			if (hasNext()) {
				int digit = num / expOf10;
				num %= expOf10;
				expOf10 /= 10;
				return digit;
			} else
				throw new NoSuchElementException("No more digits");
		}

	}

	static class IsDividedBy implements Predicate<Integer> {

		protected int num;

		public IsDividedBy(int num) {
			this.num = num;
			Klase.print(new MyNumber(123456789),(t) -> t > IsDividedBy.this.num);
			System.out.println();
			System.out.println();
			System.out.println();
		}

		@Override
		public boolean test(Integer t) {
			return (t.intValue() % num == 0);
		}

	}

	class IsLarger implements Predicate<Integer>{

		private int num;
		
		public IsLarger(int num) {
			this.num = num;
		}

		@Override
		public boolean test(Integer t) {	
			return t>num;
		}
	}

}
