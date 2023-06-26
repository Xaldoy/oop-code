package hr.fer.oop.zi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class Kolekcije {
	
	public static void main(String[] args) {

	//ArrayList	
		
	ArrayList<Integer> arr = new ArrayList<Integer>(10);
	arr.add(10);
	arr.add(11);
	arr.add(13);
	arr.add(2,12);
	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	hmap.put(1,1);
	arr.addAll(hmap.values());
	arr.addAll(hmap.keySet());
	//System.out.println(arr);
	UOP<Integer> operation = new UOP<Integer>();
	arr.replaceAll(operation);
	//System.out.println(arr);
	
	//LinkedList
	
	LinkedList<Integer> linked = new LinkedList<>();
	linked.add(1);
	linked.add(3);
	linked.add(5);
	linked.add(7);
	linked.add(9);
	System.out.println(linked);
	Kolekcije.<Integer>reverseLinkedList(linked);
	System.out.println(linked);
	
	System.out.println(linked.element());
	
	Iterator<Integer> it = linked.iterator();
	
	while(it.hasNext()) {
		System.out.print(it.next());
	}
	
	//HashSet
	
	HashSet<Integer> hset = new HashSet<>();
	
	hset.add(1);
	hset.add(2);
	hset.add(-423123);
	hset.add(3);
	hset.add(1);
	hset.add(4);
	
	Iterator<Integer> hit = hset.iterator();
	System.out.println();
	while(hit.hasNext()) {
		System.out.print(hit.next());
		System.out.print(" ");
	}
	
	//TreeSet
	
	TreeSet<Object> tset = new TreeSet<>();
	
	tset.add(1);
	tset.add(2);
	tset.add(-423123);
	tset.add(3);
	tset.add(1);
	tset.add(4);
	
	Iterator<Object> tit = tset.iterator();
	System.out.println();
	while(tit.hasNext()) {
		System.out.print(tit.next());
		System.out.print(" ");
	}
	
	LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	lhs.add(1);
	lhs.add(2);
	lhs.add(-423123);
	lhs.add(3);
	lhs.add(1);
	lhs.add(4);
	
	Iterator<Integer> lit = lhs.iterator();
	System.out.println();
	while(lit.hasNext()) {
		System.out.print(" ");
		System.out.print(lit.next());
	}
	
	Map<Integer, String> m = new HashMap<>();
	m.put(1, "Matej");
	System.out.println("\n" + m.get(1));
	
	}
	
	public static <T> void reverseLinkedList(LinkedList<T> ll) {
		for(int i = 0; i <= ll.size()/2 - 1 ; i++) {
			T temp = ll.get(i);
			ll.set(i, ll.get(ll.size() - i - 1));
			ll.set(ll.size() - i - 1, temp);
		}
	}
}
