package hr.fer.oop.mtexam.task2;

public class MultiAgentSystem {
	private Agent[] agents;
	private static int generatedId;
	
	public MultiAgentSystem(int numberOfAgents) {
		agents = new Agent[numberOfAgents];
		generatedId = 0;
	}
	
	public int getNumberOfAgents() {
		return generatedId;
	}

	public Agent[] getAgents() {
		return agents;
	}
	
	public void addAgent(Agent agent) {
		agents[generatedId-1] = agent;
	}
	
	public static int generateId() {
		return generatedId++;
	}
	
	public void systemInfo() {
		for(Agent agent: agents) {
			if(agent!=null)
			System.out.println(agent.getAgentType() + " " + agent);
		}
	}
	
	public static void main(String[] args) {
		MultiAgentSystem mas = new MultiAgentSystem(4);

		mas.addAgent(new Auctioneer("Loud", MultiAgentSystem.generateId()));
		mas.addAgent(new Bidder("Wily", MultiAgentSystem.generateId(), BiddingStrategyType.TRUTHFUL));
		mas.addAgent(new Bidder("Crafty", MultiAgentSystem.generateId(), BiddingStrategyType.SPECULATIVE));

		mas.systemInfo();

		System.out.println("---");
		System.out.println(new Auctioneer("Boisterous", MultiAgentSystem.generateId()));
		System.out.println(new Bidder("Wise", MultiAgentSystem.generateId(), BiddingStrategyType.TRUTHFUL));
	}
}
