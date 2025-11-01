import java.util.*;
public class DSA_70 {
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

    public static List<Integer> rightview(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root ==  null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode rightmost = null;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();
                rightmost = current;
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            result.add(rightmost.val);
        }
        return result;

    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(8);

        List<Integer> result = rightview(root);
        System.out.println("THE RIGHTMOST ELEMENTS IN THE BINARY TREE : "+ result);
    }
}
