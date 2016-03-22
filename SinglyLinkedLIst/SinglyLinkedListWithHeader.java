public class SinglyLinkedListWithHeader {
	
	Node header = null; //contains no data, cannot be removed

	public SinglyLinkedListWithHeader() {
		header = new Node();
	}

	void addNode(String s) {
		
		Node newNode = new Node();
		newNode.data = s;
		
		//link from newNode to current header.node
		newNode.node = header.node;
		
		//link from header to newNode
		header.node = newNode;		
		
	}
	
	
	void removeNode(String s) {

	}	

	boolean search(String s) {
		
	}
	
	void printNodes() {
		
	}	
}


