package trees_And_Graphs;

import trees_And_Graphs.TreeNode;
public class Check_Balanced{
	
	public static int check_Height(TreeNode root){
		if(root == null){
			return -1;
		}
		int leftHeight = check_Height(root.left);
		if (leftHeight == Integer.MIN_VALUE) 
			return Integer.MIN_VALUE; // Propagate error up
		
		int rightHeight = check_Height(root.right);
		if (rightHeight == Integer.MIN_VALUE) 
			return Integer.MIN_VALUE; // Propagate error up
		
		int heightDiff = leftHeight - rightHeight;
		if(Math.abs(heightDiff) > 1){
			return Integer.MIN_VALUE;
		}else{
			return Math.max(leftHeight, rightHeight) + 1;
		}
		
	}
	
	public static boolean isBalanced(TreeNode root){
		return check_Height(root) != Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		
		int[] arr={2,1,3,4,6,5,7,8,9};
		TreeNode tn=TreeNode.createMinimalBST(arr);
		System.out.println("Is balanced? " +isBalanced(tn));
		tn.insertInOrder(10);
		System.out.println("Is balanced? " +isBalanced(tn));
	}

}
