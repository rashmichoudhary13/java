package BST;

class NodeSum {
    int val;
    NodeSum left;
    NodeSum right;

    NodeSum(int val){
        this.val = val;
    }

    NodeSum(int val, NodeSum left, NodeSum right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Total_sum {

    static void traverse(NodeSum root){
        if(root == null){
            return;
        }

        traverse(root.left);
        System.out.print(root.val + " ");
        traverse(root.right);
    }

    static int sum(NodeSum root){
        if(root == null) return 0;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        int sum = root.val + leftSum + rightSum;

        return sum;
    }

    static int subTreeSum(NodeSum root){
        if(root == null) return 0;

        int leftSum = subTreeSum(root.left);
        int rightSum = subTreeSum(root.right);

       int subSum = root.val + leftSum + rightSum;

        System.out.print(subSum + " ");

        return subSum;
    }

    public static void main(String args[]) {
        NodeSum root =
        new NodeSum( 1,
           new NodeSum( 2,
              new NodeSum(4),
              new NodeSum(5)
            ),
            new NodeSum(3,
              new NodeSum(6),
              null
            )
        );

        traverse(root);

        System.out.println("");

        int totalSum = sum(root);

        System.out.println(totalSum);

        subTreeSum(root);
    }
}