package BST;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }

    Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class CreateTree{

    static int index = 0;

    static Node build(int[] preorder, int[] inOrder){

        int data = preorder[index];
        int find = -1;

        for(int i=0; i < inOrder.length; i++){
            if(inOrder[i] == data){
                find = i;
            }
        }

        Node root = new Node(data);
        index++;
        root.left = helper(preorder, inOrder, 0, find-1);
        root.right = helper(preorder, inOrder, find+1, inOrder.length-1);
        
        return root;
    }

    static Node helper(int[] preorder, int[] inOrder, int start, int end){
        if(start > end || index >= preorder.length){
            return null;
        }

        int data = preorder[index];
        int find = -1;

        for(int i=start; i <= end; i++){
            if(inOrder[i] == data){
                find = i;
                break;
            }
        }

        Node root = new Node(data);
        index++;
        
        root.left = helper(preorder, inOrder, start, find-1);
        root.right = helper(preorder, inOrder, find+1, end);

        return root;
    }

    public static void main(String args[]){
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};
        
        index = 0;
        Node root = build(preorder, inOrder);
        System.out.println("Tree built successfully!");
        System.out.println("Root value: " + root.val);
    }
}