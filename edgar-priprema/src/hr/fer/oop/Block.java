package hr.fer.oop;

public class Block {
	byte[] prevhash;
	String[] transactions;
	int size;
	Hasher hasher;

	public Block(int maxtransactions) {
		transactions = new String[maxtransactions];
		size = 0;
		hasher = new SHAHasher();
	}
	
	public Block(int maxtransactions, Hasher hash) {
		transactions = new String[maxtransactions];
		size = 0;
		hasher = hash;
	}
	
	public int add(String transaction) {
		this.transactions[size] = transaction;
		size++;
		return size-1;
	}

	public void remove(int index) {
		for (int i = index; i < size; i++) {
			transactions[i] = transactions[i + 1];
		}
		size--;
	}
	
	public byte[] hash(byte[] prevHash) {
		return hasher.hash(prevHash, this.transactions);
	}
	
	public byte[] getPrevHash() {
		return prevhash;
	}
	
	public void setPrevHash(byte[] prevHash) {
		this.prevhash = prevHash;
	}

}
