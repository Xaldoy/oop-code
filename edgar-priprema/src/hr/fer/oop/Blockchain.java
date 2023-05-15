package hr.fer.oop;

import java.util.Arrays;

public class Blockchain {
	Block[] blocks;
	int size;

	public Blockchain(int maxBlocks) {
		blocks = new Block[maxBlocks];
		size = 0;
	}
	
	public int add(Block newBlock) {
		blocks[size] = newBlock;
		if (size == 0) {
			blocks[size].setPrevHash(new byte[] { 0 });
		} else {
			byte[] prevhash = blocks[size - 1].hash(blocks[size - 1].getPrevHash());
			blocks[size].setPrevHash(prevhash);
		}
		size++;
		return size-1;
	}

	public Block get(int index) {
		return blocks[index];
	}

	public boolean isAltered(int blockIndex, byte[] expectedHash) {
		for (int i = 1; i <= blockIndex; i++) {
			if(!Arrays.equals(blocks[i].getPrevHash(), blocks[i-1].hash(blocks[i-1].getPrevHash()))) {
				return true;
			}		
		}
		if(!Arrays.equals(blocks[blockIndex].hash(blocks[blockIndex].getPrevHash()),expectedHash))
			return true;
		return false;
		
	}
}
