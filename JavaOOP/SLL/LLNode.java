import java.util.*;
public class LLNode{
	private int val;
	private LLNode next;

	public LLNode(int val){
		this.val = val;
	}


	// GETTERS and SETTERS
	public int getVal(){
		return val;
	}
	public void setVal(int val){
		this.val = val;
	}

	public LLNode getNext(){
		return next;
	}
	public void setNext(LLNode next){
		this.next = next;
	}
}