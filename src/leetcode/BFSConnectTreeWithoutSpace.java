package leetcode;

public class BFSConnectTreeWithoutSpace {
	public void connect(TreeLinkNode root) {
        while (root != null) {
            //tmpLevelFirst为新建立的每层第一个节点（为了方便后面遍历当前行节点）
            TreeLinkNode tmpLevelFirst = new TreeLinkNode(0);
            TreeLinkNode cur = tmpLevelFirst;
            while (root != null) {
                if (root.left != null) {
                    cur.next = root.left;
                    cur = cur.next;
                }
                if (root.right != null) {
                    cur.next = root.right;
                    cur = cur.next;
                }
                root = root.next;
            }
            root = tmpLevelFirst.next;
        }
    }
}
