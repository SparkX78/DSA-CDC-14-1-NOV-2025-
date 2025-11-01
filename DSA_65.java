public class DSA_65 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    
    public static void main(String args[]){
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(15);
        tree.right = new TreeNode(17, new TreeNode(21), new TreeNode(22));
        int depth = maxDepth(tree);
        System.out.println("THE MAXIMUM LENGTH OF BINARY TREE : " + depth);
    }
}
