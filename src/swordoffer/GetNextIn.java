package swordoffer;

public class GetNextIn {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
    	
    	if(pNode == null)
    		return null;
    	if(pNode.left != null){
    		GetNext(pNode.left);
    	}
    	if(pNode.right != null){
    		GetNext(pNode.right);
    	}
    	
		return pNode;
        
    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}