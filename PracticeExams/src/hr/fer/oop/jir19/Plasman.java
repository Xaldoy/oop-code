package hr.fer.oop.jir19;

public class Plasman {
	private int godina;
	private int redniBrojUtrke;
	private String vozac;
	private int plasman;

	public Plasman(int godina, int redniBrojUtrke, String vozac, int plasman) {
		super();
		this.godina = godina;
		this.redniBrojUtrke = redniBrojUtrke;
		this.vozac = vozac;
		this.plasman = plasman;
	}

	public int getGodina() {
		return godina;
	}

	public int getRedniBrojUtrke() {
		return redniBrojUtrke;
	}

	public String getVozac() {
		return vozac;
	}

	public int getPlasman() {
		return plasman;
	}

	@Override
	public String toString() {
		return "Plasman [godina=" + godina + ", redniBrojUtrke=" + redniBrojUtrke + ", vozac=" + vozac + ", plasman="
				+ plasman + "]";
	}

	
	
}
