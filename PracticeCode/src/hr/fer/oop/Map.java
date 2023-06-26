package hr.fer.oop;

import java.util.Collection;
import java.util.Set;

public interface Map<K, V> {
	public class Entry<T1, T2> {

	}
	int size();

	boolean isEmpty();

	boolean containsKey(Object key);

	boolean containsValue(Object value);

	V get(Object key);

	V put(K key, V value); // optional

	V remove(Object key); // optional

	void putAll(Map<? extends K, ? extends V> m); // opt.

	void clear(); // optional

	Set<K> keySet();

	Collection<V> values();

	Set<Map.Entry<K, V>> entrySet();

	boolean equals(Object o);

	int hashCode();
}
