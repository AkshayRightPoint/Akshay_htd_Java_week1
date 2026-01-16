package com.week3.dsa.problem.solving;
class TreeNode{
    int data;
    TreeNode left, right;

    TreeNode(int data){
        this.data= data;
        left = right = null;
    }
}
public class TreeExample2 {
    static int idx = -1;
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode roots = buildTree(nodes);

        System.out.print("Pre-Order Data - > ");
        preOrderPrint(roots);
    }

    public static TreeNode buildTree(int[] node){
        idx++;
        if(idx >= node.length || node[idx] == -1){
            return null;
        }
        TreeNode root = new TreeNode(node[idx]);
        root.left = buildTree(node);
        root.right = buildTree(node);
        return root;
    }

    static  void preOrderPrint(TreeNode root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);

    }
}
