package leetcode;


public class TreeSumNumbers {
	
	public int sumNumbers(TreeNode root) {
		return preOrder(root, 0);
	}

	private int preOrder(TreeNode root, int sum) {
		if(root == null)
			return 0;
		sum = sum * 10 + root.val;
		if(root.left == null && root.right == null ){
			return sum;
		}
		return preOrder(root.left,sum) + preOrder(root.right,sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//不满足要求的答案
  /*  int res = 0;
    List<List<Integer>> broad_sums = new ArrayList<List<Integer>>();//用于保存每一层的代表的数值权重
	public int sumNumbers(TreeNode root) {
		if(root == null)
			return 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode pos = new TreeNode(0);
		int broad = 0;//目前有多少层
		while(!queue.isEmpty()){
			int broad_size = queue.size();
			int broad_sum = 0;
			int broad_son_sum = 0;
			for(int j = 0; j < broad_size; j++){
				pos = queue.peek();
				broad_sum += queue.poll().val;
				if(pos.left != null){
					queue.add(pos.left);
					broad_son_sum++;
				}
				if(pos.right != null){
					queue.add(pos.right);
					broad_son_sum++;
				}
			}
			for(int j = 0; j < broad; j++){
				List<Integer> list = broad_sums.get(j);
				list.set(j, list.get(0)*list.get(1)*10);
			}
			broad++;
			List<Integer> list = new ArrayList<Integer>();
			list.add(broad_sum);
			list.add(broad_son_sum);
			broad_sums.add(list);
		}
		for(List<Integer> list:broad_sums)
			res += list.get(0);
        return res;
    }*/
}
