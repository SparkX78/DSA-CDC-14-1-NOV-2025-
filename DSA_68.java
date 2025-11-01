public class DSA_68 {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private static int maxDiameter = 0;
    public static int max_Diameter(TreeNode root){
        depth(root);
        return maxDiameter;
    }
    private static int depth(TreeNode node){
        if(node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        maxDiameter = Math.max(maxDiameter, left + right);

        return 1+ Math.max(left, right);
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(13);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(16);
        root.right = new TreeNode(14);

        int max_D = max_Diameter(root);
        System.out.println("THE MAXIMUM DIAMETER IS : " + max_D);
    }
}
