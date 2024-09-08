package TreeNode;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left=null;
        right=null;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(8);
        root.right=new TreeNode(15);

        TreeNode leftnode=root.left;
        TreeNode rightnode=root.right;

        leftnode.left=new TreeNode(16);
        rightnode.left=new TreeNode(23);
        rightnode.right=new TreeNode(42);

        System.out.println(root.val);
        System.out.println(root.right.left.val);
        System.out.println(leftnode.left.val);

        inordertraversal(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }

    static void inordertraversal(TreeNode root){
        if(root==null)
            return;

        inordertraversal(root.left);
        System.out.print(root.val+"->");
        inordertraversal(root.right);
    }

    static void preorder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.val+"->");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+"->");
    }
    public static void levelorderTraversal(TreeNode root){
        Queue<TreeNode>treeNodeQueue=new LinkedList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()){
           TreeNode treeNode=treeNodeQueue.poll();
            System.out.print(treeNode.val+"->");
            if(treeNode.left!=null){
                treeNodeQueue.add(treeNode.left);
            }
            if(treeNode.right!=null){
                treeNodeQueue.add(treeNode.right);
            }
        }
    }
    public int diameterofBinaryTree(TreeNode root){
        Map<TreeNode,Integer> map=new HashMap<>();
        Stack<TreeNode> stack=new Stack<>();
        int diameter=0;
        if(root!=null){
            stack.push(root);
        }
        while (!stack.isEmpty()){
            TreeNode node=stack.peek();

            if(node.left!=null&&!map.containsKey(node.left)){
                stack.push(node.left);
            }
            if(node.right!=null && !map.containsKey(node.right)){
                stack.push(node.right);
            }else {
                stack.pop();

                int leftDepth=map.getOrDefault(node.left,0);
                int rightDepth=map.getOrDefault(node.right,0);

                map.put(node,1+Math.max(leftDepth,rightDepth));
                diameter=Math.max(diameter,(leftDepth+rightDepth));
            }
        }
        return diameter;
    }
    int height(TreeNode root){
        Queue<TreeNode> elementQueue=new LinkedList<>();
        elementQueue.add(root);
        int numberOfLevels=-1;
        while (true){
            int nodeCountAtLevel=elementQueue.size();
            if(nodeCountAtLevel==0){
                return numberOfLevels;
            }

            while (nodeCountAtLevel>0){
                TreeNode element=elementQueue.poll();
                if(element.left!=null){
                    elementQueue.add(element.left);
                }
                if(element.right!=null){
                    elementQueue.add(element.right);
                }
                nodeCountAtLevel--;
            }
            numberOfLevels++;
        }
    }
    int rangeSumBST(TreeNode root,int low,int high){
        if(root==null){
            return 0;
        }
        int sum=0;

        if(root.val>low){
            sum+=rangeSumBST(root.left,low,high);
        }
        if(root.val>=low && root.val<=high){
            sum+=root.val;
        }
        if(root.val<high){
            sum+=rangeSumBST(root.right,low,high);
        }
        return sum;
    }
}
