package hr.fer.oop.mtexam.task2;

public class Bidder extends Agent{

	BiddingStrategyType strategyType;
	
	public Bidder(String name, int iD, BiddingStrategyType strategyType) {
		super(name, iD);
		this.strategyType = strategyType;
	}

	public BiddingStrategyType getStrategyType() {
		return strategyType;
	}

	public void setStrategyType(BiddingStrategyType strategyType) {
		this.strategyType = strategyType;
	}
	
	public String getAgentType() {
		return "bidder";
	}
	
}
