package implementation;
public class Checkout {
	private int runningTotal = 0;
	public void add(int count, int price) {
		runningTotal += (count * price);
		System.out.println(runningTotal);
	}

	public int total() {
	return runningTotal;
	}
}
