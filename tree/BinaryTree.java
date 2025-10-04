package tree;



public class BinaryTree {

    static class Node{


        int data;
        Node left;
        Node right;

        Node(int data){
        this.data = data;
        this.right=null;
        this.left=null;

    }
    }
    Node root;

    BinaryTree(){
        root=null;
    }

    void preorder(Node node){
       if (node==null)
           return ;
       System.out.println(node.data+" ");
      preorder(node.left);
       preorder(node.right);

    }

    void inorder(Node node){

        if (node==null)
            return ;

        inorder(node.left);
        System.out.println(node.data+" ");
        inorder(node.right);



    }

    void postorder(Node node){

        if (node==null)
            return ;
        System.out.println(node.data+" ");
        postorder(node.left);
        postorder(node.right);

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);

        System.out.println("PREORDER TRAVERSAL");
        binaryTree.preorder(binaryTree.root);

        System.out.println("INORDER TRAVERSAL");
        binaryTree.inorder(binaryTree.root);


        System.out.println("POSTORDER TRAVERSAL");
        binaryTree.postorder(binaryTree.root);


    }






}
