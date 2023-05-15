package hr.fer.oop.mtexam.task2;

public class Auctioneer extends Agent{
	private int startingPrice;

	public Auctioneer(String name, int iD) {
		super(name, iD);
	}
	
	public int getStartingPrice() {
		return startingPrice;
	}

	public String getAgentType() {
		return "auctioneer";
	}
	
	public void startAuction() {
		startingPrice = (int)(Math.random() * 11 + 10);
	}
	
}
