public class DSA_66 {
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
    public static boolean Structure(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return Structure(root1.left, root2.left) && Structure(root1.right, root2.right);
    }

    public static void main(String args[]){
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(Structure(root1, root2));
    }
}
