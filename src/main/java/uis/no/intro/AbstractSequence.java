package main.java.uis.no.intro;

public abstract class AbstractSequence implements SearchableSequence {
	public int sum(int n) {
		int result = 0;
		for (int i=0;i<n;i++) {
			result += getElement(i);
		}
		return result;
	}

	@Override
	public int product(int n) {
		int result = 1;
		for (int i=0;i<n;i++) {
			result *= getElement(i);
		}
		return result;
	}
	
	public int findElementIn(int k, int limit) {
		int lowestindex = 0;
		int highestindex = limit;
		int currentindex;
		int currentValue = getElement(highestindex);
		if (currentValue < k) return -1;
		if (currentValue == k) return highestindex;
		currentindex = highestindex/2;
		while (highestindex-lowestindex > 1) {
			currentValue = getElement(currentindex);
			if (currentValue == k) return currentindex;
			if (currentValue < k) lowestindex = currentindex;
			if (currentValue > k) highestindex = currentindex;
			currentindex = (lowestindex + highestindex)/2;
		}
		return -1;
	}
}
