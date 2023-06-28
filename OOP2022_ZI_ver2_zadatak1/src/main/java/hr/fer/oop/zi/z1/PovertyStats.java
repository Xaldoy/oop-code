package hr.fer.oop.zi.z1;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PovertyStats {

	private List<PovertyDatum> data = new ArrayList<>();

	public PovertyStats(List<PovertyDatum> data) {
		this.data = data;
	}

	public List<String> topImproving(int cutoff) {

		return data.stream().collect(Collectors.toMap(a -> a.getLocation(), b -> (Double)data
				.stream().filter(c -> c.getLocation().equals(b.getLocation())).sorted(Comparator
				.comparing(PovertyDatum::getProportion)).map(d -> d.getProportion()).collect(Collectors
				.toList()).stream().limit(2).reduce(0d, (z, y) -> Math.abs(z - y)).doubleValue(), (p, k) -> p))
				.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed())
				.limit(cutoff).map(m -> m.getKey()).toList();
	}
}
