
public class LinkedList {
	Node headNode;
	Node tailNode;
	LinkedList (int headContent){
		Node newNode = new Node();
		newNode.setElement(headContent);
		newNode.setNext(null);
		headNode = newNode;
		tailNode = newNode;
	}
	
	
	public void addItem(int itemContent){
		Node newNode = new Node();
		newNode.setElement(itemContent);
		newNode.next = headNode;
		headNode = newNode;
		tailNode.next = newNode;
	}
	
	public int getLength(){
		int returnValue = 0;
		
		Node currentNode = headNode;

		while(currentNode!=null){
				returnValue++;
				currentNode = currentNode.next;
		}
		return returnValue;
	}
	
	public void removeHead(){
		headNode = headNode.next;
	}
	
	public void find(int content){
		Node currentNode = headNode;

		while(currentNode!=null){
			if(currentNode.getElement()==content){
				System.out.println("Found ");
			
			}

			
			
			currentNode = currentNode.next;
			
		
		}
	}
	public void printTail(){
		System.out.println("tail :"+tailNode.toString()+" ");
	}
	public void printHead(){
		System.out.println("head :"+headNode.toString()+" ");
	}
	public void printAll(){
		Node currentNode = headNode;
		boolean isFirstPassed = false;
		while(currentNode!=null){
			if(isFirstPassed&&currentNode==headNode){
				break;
			}
		
			System.out.println(currentNode.toString()+" ");
			currentNode = currentNode.next;
			
			isFirstPassed=true;
		
		}
	}
}