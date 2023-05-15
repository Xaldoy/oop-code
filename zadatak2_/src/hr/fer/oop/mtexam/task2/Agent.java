package hr.fer.oop.mtexam.task2;

public abstract class Agent {
	private String name;
	private int ID;

	public Agent(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}
	
	public abstract String getAgentType();
	
	@Override
	public String toString() {
		return String.format("(name: %s, id: %d)", getName(), getID());
	}

}
