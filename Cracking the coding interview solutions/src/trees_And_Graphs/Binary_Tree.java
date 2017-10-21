package trees_And_Graphs;

/*
 * Basic Binary Tree with Traversal
 */
public class Binary_Tree {
	public int data;
	public Binary_Tree leftChild;
	public Binary_Tree rightChild;
	
	
	Binary_Tree(){
		
	}
	
	Binary_Tree(int data){
		this.data=data;
		this.leftChild=null;
		this.rightChild=null;
	}
	//Adds in order. left.data < root.data <=right.data
	public void addNode(int val){
		Binary_Tree node= new Binary_Tree(val);
		if(val<data){
			if(leftChild == null){				
				leftChild=node;
			}
			else{
				leftChild.addNode(val);
			}
		}
		else{
			if(rightChild == null){
				rightChild=node;
			}else{
				rightChild.addNode(val);
			}
		}
			
	}
	public boolean isBST(){
		if(rightChild != null){
			if(data>rightChild.data || !rightChild.isBST()){
				return false;
			}
		}
		if( leftChild != null){
			if(data <= leftChild.data || !leftChild.isBST()){
				return false;
			}
		}		
		return true;
	}
	
	public int find(int key){
		if(key == data){
			return data;
		}
		else if(key < data){				
				return leftChild == null? -1 :leftChild.find(key);
		}
		else if(key > data){
				return rightChild == null ? -1 :rightChild.find(key);
		}
		System.out.println("key not found");
		return -1;
	}

	public void preOrderTraversal(){
		System.out.println(data);
		if(leftChild != null){			
			leftChild.preOrderTraversal();
		}
		if(rightChild != null){			
			rightChild.preOrderTraversal();
		}
	}
	
	public void postOrderTraversal(){
		if(leftChild != null){			
			leftChild.postOrderTraversal();
		}		
		if(rightChild != null){			
			rightChild.postOrderTraversal();
		}
		System.out.println(data);
	}
	
	public void inOrderTraversal(){
		if(leftChild != null){			
			leftChild.inOrderTraversal();
		}
		System.out.println(data);
		if(rightChild != null){			
			rightChild.inOrderTraversal();
		}
	}

	
	public static void main(String[] args) {
		Binary_Tree bt= new Binary_Tree(4);
		
		bt.addNode(2);
		bt.addNode(1);
		bt.addNode(3);
		bt.addNode(6);
		bt.addNode(5);
		bt.addNode(7);
//		System.out.println("preOrderTraversal");
//		bt.preOrderTraversal();
//		System.out.println("postOrderTraversal");
//		bt.postOrderTraversal();
//		System.out.println("inOrderTraversal");
//		bt.inOrderTraversal();
//		System.out.println(bt.isBST());
		int key=6;
		int result=bt.find(key);
		if(result >= 0)
			System.out.println(key + " Found");
		else
			System.out.println(key+" Not found");
	}

}
