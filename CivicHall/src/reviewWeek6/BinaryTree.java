package reviewWeek6;

public class BinaryTree {
	
	public static void main(String [] args) {
		
		BTree tree =  makeTree();
		
		while (!solve(tree)) {
		System.out.println(solve(tree));
		}
		
		
		
	}
	
	static BTree makeTree() {
		
		BTree c3 = new BTree(null, null, false, "C3");
		BTree c5 = new BTree(null,null,true,"C5");
		BTree c6 = new BTree(null,null,false,"C6");
		BTree c2 = new BTree(c5, c6, false, "C2");
		BTree c4 = new BTree(null, null, true, "C4");
		BTree c1 = new BTree(c3,c4, false, "C1");
		BTree C = new BTree(c1,c2, false,"C");
		
		return C;	
		}
	
	
	
	static Boolean solve(BTree n) {
		
			
			if (n == null) {
			System.out.println(n + " Null Node");
			return false;
			}
		
			if (n.isGoalNode) {
				//solve(n);
				System.out.println("True Node: "+ n.name);
				return true;
			}
			
			if (solve(n.leftN)) {
				System.out.println(n.name);
				return true;
			}
			
			if(solve(n.rightN)) {
				System.out.println(n.name);
				return true;
			}
			
			
			else {
				return false;
			}
			
			
		
				
	}
}
	
	
	



class BTree{
	
	BTree leftN = null;
	BTree rightN = null;
	
	Boolean isGoalNode = false;
	String name;
	public BTree(BTree leftN, BTree rightN, Boolean isGoalNode, String name) {
		this.leftN = leftN;
		this.rightN = rightN;
		this.isGoalNode = isGoalNode;
		this.name = name;
	}
	

}
