import java.util.*;
public class SLL{
	private LLNode head;


	public void addToBack(int val){
		LLNode newNode = new LLNode(val);
		if(head == null){
			head = newNode;
		} else {
			LLNode runner = head;
			while(runner.getNext() != null){
				runner = runner.getNext();
			}
			runner.setNext(newNode);	
		}
	}

	public void removeLastNode(){
		if(head == null){
			System.out.println("There is no list to remove a node from!");
		//}else if(){

		} else {
			LLNode temp = getHead();
			LLNode current = getHead();
			while(current.getNext() != null){
				temp = current;
				//System.out.println("Test");
				current = current.getNext();
			}
			temp.setNext(null);
		}
	}

	public void printValues(){
		if(head == null){
			System.out.println("There are currently no nodes in this list!");
			
		}

		LLNode runner = head;
		while(runner != null){
			System.out.println(runner.getVal());
			runner = runner.getNext();
		}
		System.out.println("-----------------------");
	}


	// public void getAllNodes(){
	// }

	// GETTERS and SETTERS
	public LLNode getHead(){
		return head;
	}

	public void setHead(LLNode head){
		this.head = head;
	}
}