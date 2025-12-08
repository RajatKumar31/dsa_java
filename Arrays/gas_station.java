package Arrays;

class gas_station {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas.length != cost.length) {
			return -1;
		}
		int gasSum = 0, costSum = 0;
		for (int i = 0; i < gas.length; i++) {
			gasSum = gasSum + gas[i];
			costSum = costSum + cost[i];
		}
		if (gasSum < costSum) {
			return -1;
		}

		int total = 0, start = 0;
		for (int i = 0; i < gas.length; i++) {
			total = total + gas[i] - cost[i];
			if (total < 0) {
				total = 0;
				start = i + 1;
			}
		}
		return start;
	}
}
