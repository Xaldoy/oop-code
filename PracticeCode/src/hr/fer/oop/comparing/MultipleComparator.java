package hr.fer.oop.comparing;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MultipleComparator<T> implements Comparator<T>{

	private List<Comparator<T>> comparators;
	
	@SafeVarargs
	public MultipleComparator(Comparator<T> ... comparators) {
		this.comparators = new ArrayList<>();
		Collections.addAll(this.comparators, comparators);
	}


	@Override
	public int compare(T o1, T o2) {
		for(Comparator<T> c : comparators) {
			int r = c.compare(o1, o2);
			if(r!=0) return r;
		}
		return 0;
	}

}
