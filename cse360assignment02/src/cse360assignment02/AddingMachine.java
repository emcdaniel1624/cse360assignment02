package cse360assignment02;

public class AddingMachine {
  private int total;
  private String output = "0 ";
  
  public AddingMachine () {
	  total = 0;
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  output = output + "+ " + value + " ";
  }

  public void subtract (int value) {
	  total -= value;
	  output = output + "- " + value + " ";
  }

  public String toString () {
    return output;
  }

  public void clear() {
	  total = 0;
	  output = "0 ";
  }
}