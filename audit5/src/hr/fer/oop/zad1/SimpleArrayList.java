package hr.fer.oop.zad1;

public class SimpleArrayList {
	
	private Object[] elementData;
	private int size;
	
	public SimpleArrayList() {
		elementData = new Object[2];
		size = 0;
	}
	
	private void ensureCapacity(int minCapacity) {
		int current = elementData.length;
		if(minCapacity > current) {
			Object[] newData = new Object[current*2];
			System.arraycopy(elementData, 0, newData, 0, size);
			elementData = newData;
		}
	}
	
	public boolean add(Object o) {
		ensureCapacity(size + 1);
		elementData[size++] = o;
		return true;
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int index) {
		Object found = null;
		if(index < size) {
			found = elementData[index];
		}
		return found;
	}
	
	public int indexOf(Object o) {
		int found = -1;
		for(int i = 0; i < size; i++) {
			if(elementData[i] == o) found = i;
		}
		return found;
	}
	

	  public static void main(String[] args) {
	    SimpleArrayList list = new SimpleArrayList();
	    list.add("first");
	    list.add("second");
	    list.add("third");

	    System.out.println(list.size()); // 3
	    for(int i = 0; i < list.size(); i++)
	      System.out.println("Element " + i + ": " + list.get(i));
	    System.out.println(list.indexOf("second")); // 1
	  }
}






