package swordoffer;

public class VerifySquenceOfBST {
	public boolean VerifySquenceOfBST(int [] sequence) {
        int start = 0, end = sequence.length - 1;
        if(end == -1)
        	return false;
        boolean isOrder = verifySquenceOfBST(sequence, start, end);
        return isOrder;
    }

	private boolean verifySquenceOfBST(int[] sequence, int start, int end) {
		boolean isOrder = true;
		int i, pos = end;
		int root_val = sequence[end]; 
		
		//找到分界点，pos为右子树的起点
		for(i = start; i < end; i++){
			if(sequence[i] > root_val){
				pos = i;
				break;
			}
		}
		//遍历右子树，需要右子树每一个阶段都大于root_val才满足要求
		for(i = pos; i < end; i++){
			if(sequence[i] < root_val)
				isOrder = false;
		}
		
		boolean isLeftOrder = true, isRightOrder = true;
		if(isOrder){
			if(pos - start > 1){ //左子树的节点数大于1
				isLeftOrder = verifySquenceOfBST(sequence, start, pos - 1);
			}
			if(end - pos > 1){ //右子树结点数大于1
				isRightOrder = verifySquenceOfBST(sequence, pos, end - 1);
			}
		}
		
		return isOrder && isLeftOrder && isRightOrder;
	}
}
