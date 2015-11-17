package main.java.no.uis.intro;

public class BasicTest {
	public static void main(String[] args) {
		ArithmeticSequence testseq = new ArithmeticSequence(2, 1);
		System.out.println(testseq);
		System.out.println(testseq.findElementIn(4, 8));
		
		System.out.println(testseq.findElementIn(7, 8));
	}
}
