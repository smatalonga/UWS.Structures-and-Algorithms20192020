package stacksandqueues;


//LIFO ~ Last in First out QUEUE (Slides 1 to 7)
//fOR SIMPLICITY, MINE IS NOT USING stackadt FROM LIBRARY (SEE SILDE 5)

public class LIFOStack {
	private StackNode top;
	
	public LIFOStack() {
		top = null;
		
	}
	
	
	public void push(Object o) {
		StackNode newNode = new StackNode(o, top);
		top = newNode;
		
	}

	public Object pop() {
		if (top == null) {
			return null;
		}
		else {
			Object toPop = top.getData();
			top = top.getNext();
			return toPop;
		}
		
	}

}
