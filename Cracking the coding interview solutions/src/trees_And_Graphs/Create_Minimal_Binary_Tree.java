package trees_And_Graphs;

public class Create_Minimal_Binary_Tree {
	public static class TreeNode {
		public int data;      
		public TreeNode left;    
		public TreeNode right; 
		public TreeNode parent;
		private int size = 0;

		public TreeNode(int d) {
			data = d;
			size = 1;
		}
		
		private void setLeftChild(TreeNode left) {
			this.left = left;
			if (left != null) {
				left.parent = this;
			}
		}
		
		private void setRightChild(TreeNode right) {
			this.right = right;
			if (right != null) {
				right.parent = this;
			}
		}
		public int size() {
			return size;
		}
		
		public boolean isBST() {
			if (left != null) {
				if (data < left.data || !left.isBST()) {
					return false;
				}
			}
			
			if (right != null) {
				if (data >= right.data || !right.isBST()) {
					return false;
				}
			}		
			
			return true;
		}
		
	public static TreeNode createMinimalBST(int arr[], int start, int end){
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.setLeftChild(createMinimalBST(arr, start, mid - 1));
		n.setRightChild(createMinimalBST(arr, mid + 1, end));
		return n;
	}
	public int height() {
		int leftHeight = left != null ? left.height() : 0;
		int rightHeight = right != null ? right.height() : 0;
		return 1 + Math.max(leftHeight, rightHeight);
	}
	public static TreeNode createMinimalBST(int array[]) {
		return createMinimalBST(array, 0, array.length - 1);
	}
}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		System.out.println("Root is " + root.data);
		System.out.println("Created BST? " + root.isBST());
		System.out.println("Height: " + root.height());
	}
}
