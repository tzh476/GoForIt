package swordoffer;

public class TreeConvertLinkList {
	
	TreeNode startNode = null; 
	TreeNode endNode = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
		
    	if(pRootOfTree == null){
    		return null;
    	}
    	Convert(pRootOfTree.left);
    	
    	if(endNode == null){
    		startNode = pRootOfTree;
    		endNode = pRootOfTree;
    	}else{
    		//将当前结点加到endNode末尾，然后将endNode向后移一位
    		pRootOfTree.left = endNode;
    		endNode.right = pRootOfTree;
    		endNode = pRootOfTree;
    	}
    	
    	Convert(pRootOfTree.right);
    	
    	return startNode;
        
    }
}
