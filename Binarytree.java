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
    public void preOrderRecursiveTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data + " ");
        preOrderRecursiveTraversal(root.left);
        preOrderRecursiveTraversal(root.right);
    }

    //traversing the binary tree iteratively
    public void preOrderIterativeTraversal(TreeNode root)
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

    //inorder traversal recursevely
    public void inOrderRecursiveTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        inOrderRecursiveTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderRecursiveTraversal(root.right);

    }
    
    //inorder traversal iterative
    public void inOrderIterativeTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!=null)
        {
            if(temp!=null)
            {
                stack.push(temp);
                temp = temp.left;
            }
            else
            {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void postOrderRecursiveTraversal(TreeNode root)
    {
        if(root == null) return;

        postOrderRecursiveTraversal(root.left);
        postOrderRecursiveTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void postOrderIterativeTraversal(TreeNode root)
    {

    }
}

class Main
{
    public static void main(String[] args) {
        
        BinaryTree bt = new BinaryTree();
        bt.createTree();


        System.out.println("preorder recursive traversal");
        bt.preOrderRecursiveTraversal(bt.root);


        System.out.println();
        System.out.println("preorder iterative traversal");
        bt.preOrderIterativeTraversal(bt.root);


        System.out.println();
        System.out.println("inorder recursive traversal");
        bt.inOrderRecursiveTraversal(bt.root);

        System.out.println();
        System.out.println("inorder iterative traversal");
        bt.inOrderIterativeTraversal(bt.root);

        System.out.println();
        System.out.println("post order recursive traversal");
        bt.postOrderRecursiveTraversal(bt.root);

        System.out.println();
        System.out.println("post order iterative traversal");
        bt.postOrderIterativeTraversal(bt.root);
    }
}