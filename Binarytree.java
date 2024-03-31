import java.util.Stack;

class TreeNode
{
    public TreeNode left;
    public TreeNode right;
    public int data;

    TreeNode(int data)
    {
        this.data = data;
    }
}

class BinaryTree
{
    public TreeNode root;

    public void createTree()
    {
        //creating the nodes
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(1);
        TreeNode fourth = new TreeNode(2);

        //joining the nodes
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;

    }

    //traversing through the nodes (recursive)
    public void traversingTree(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data + " ");
        traversingTree(root.left);
        traversingTree(root.right);
    }

    //traversing the binary tree iteratively
    public void traversingIteratively(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop();

            System.out.print(temp.data + " ");

            

            if(temp.right != null)
            {
                stack.push(temp.right);
            }

            if(temp.left != null)
            {
                stack.push(temp.left);
            }
        }
    }

    
}

class Main
{
    public static void main(String[] args) {
        
        BinaryTree bt = new BinaryTree();
        bt.createTree();
        bt.traversingTree(bt.root);
        System.out.println();
        bt.traversingIteratively(bt.root);
    }
}