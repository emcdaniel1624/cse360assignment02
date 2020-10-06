package cse360assignment02;

public class main {

	public static void main(String[] args) {
		AddingMachine myAdder = new AddingMachine();
		myAdder.add(4);
		myAdder.add(5);
		myAdder.subtract(2);
		myAdder.subtract(1);
		System.out.println(myAdder.toString());
	}

}
