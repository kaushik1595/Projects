import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Subscriptions {

	public static void main(String args[]) {
		int totalBudget = 5000;
		int currentBudget = 0;
		int netflix = 0;
		int prime = 0;
		int zee5 = 0;
		int sonyLiv = 0;
		int finalCount = 0;
		Map<String, Integer> providers = new LinkedHashMap<String, Integer>();
		providers.put("Netflix", 649);
		providers.put("Prime", 999);
		providers.put("Zee5", 999);
		providers.put("SonyLiv", 999);
		String subscription;
		HashMap<String, String> map = new HashMap<String, String>();
		// Loops the Map data multiple times until it reaches totalBudget
		while (currentBudget <= totalBudget) {
			// loops the providers Map
			for (Map.Entry<String, Integer> iteratorMap : providers
					.entrySet()) {
				// aggregating the Subscription Value
				currentBudget = currentBudget + iteratorMap.getValue();
				if (currentBudget <= totalBudget) {
					switch (iteratorMap.getKey()) {
						case "Netflix" :
							netflix = netflix + 1;
							subscription = "Monthly Subscription";
							map.put("Netflix",
									iteratorMap.getKey() + " " + netflix + "x "
											+ subscription + " "
											+ iteratorMap.getValue() * netflix);
							break;
						case "Prime" :
							prime = prime + 1;
							subscription = "Annual Subscription";
							map.put("Prime",
									iteratorMap.getKey() + " " + prime + "x "
											+ subscription + " "
											+ iteratorMap.getValue() * prime);
							break;
						case "SonyLiv" :
							sonyLiv = sonyLiv + 1;
							subscription = "Annual Subscription";
							map.put("SonyLiv",
									iteratorMap.getKey() + " " + sonyLiv + "x "
											+ subscription + " "
											+ iteratorMap.getValue() * sonyLiv);
							break;
						case "Zee5" :
							zee5 = zee5 + 1;
							subscription = "Annual Subscription";
							map.put("Zee5",
									iteratorMap.getKey() + " " + zee5 + "x "
											+ subscription + " "
											+ iteratorMap.getValue() * zee5);
							break;
					}
				} else if (finalCount < providers.size()) {
					currentBudget = currentBudget - iteratorMap.getValue();
					finalCount++;
				}
			}
		} ;
		// Prints the IteratorResultMap Values
		for (String iteratorResultMap : map.values()) {
			System.out.println(iteratorResultMap);
		}
	}
}