package lt20170507;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 * @author litong
 *
 */
public class Erchashu {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	  
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			if(node.left!=null){
				queue.offer(node.left);
			}
			if(node.right!=null){
				queue.offer(node.right);
			}
			list.add(node.val);
		}
		return list;
	}
}

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
