public class Main {
	
	public static void main(String[] args) {
		String[] stringData = {"Albert", "Billy", "Charles", "David", "Emma"};
		SinglyLinkedListWithHeader sll = new SinglyLinkedListWithHeader();
		//populate
		for(int i = stringData.length -1; i >= 0; i--) {
			sll.addNode(stringData[i]);
		}
		boolean foundCharles = sll.search("Charles");
		System.out.println("Found Charles? " + foundCharles);
		
		sll.printNodes();
		sll.addNode("Frank");
		sll.removeNode("David");
		sll.printNodes();
	}
}
