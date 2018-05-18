import java.util.*;
public class SLLTest{
	public static void main(String[] args){
		SLL sllOne = new SLL();

		sllOne.printValues();


		sllOne.addToBack(4);
		sllOne.addToBack(42);
		sllOne.addToBack(420);
		sllOne.addToBack(42);
		sllOne.addToBack(4);
		sllOne.printValues();



		sllOne.removeLastNode();
		sllOne.printValues();

		sllOne.addToBack(500);
		sllOne.addToBack(501);
		sllOne.printValues();

		sllOne.removeLastNode();
		sllOne.printValues();
		
		sllOne.removeLastNode();
		sllOne.printValues();

		sllOne.removeLastNode();
		sllOne.printValues();

		sllOne.removeLastNode();
		sllOne.printValues();

		sllOne.removeLastNode();
		sllOne.printValues();
	}
}