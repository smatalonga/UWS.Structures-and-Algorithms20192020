package stacksandqueues;


//FIFO First in - First Out Stack
//FIFO are a special type of  Stackescalled Queue.
public class FIFOStack {
	private StackNode root;
	
	public FIFOStack() {
		root = null;
		
	} 
	
	public void push(Object o) {
		if (root == null) {
			StackNode newNode = new StackNode(o);
			root = newNode;
		}
		else {
			StackNode newNode = new StackNode(o);
			root.setNext(newNode);
		}
		
	}
	
	public Object pop() {
		if (root == null) {
			return null;
		}
		else {
			Object toPop = root.getData();
			root = root.getNext();
			return toPop;
		}	
	}
	
	
	
}
