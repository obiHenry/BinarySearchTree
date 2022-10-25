public class Tree {

    private TreeNode root;

    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);
        } else  {
            root.insert(value);
        }

    }

    public void delete(int value){
        root = delete(root, value);
    }
    
    private  TreeNode delete(TreeNode subTreeNode, int value){
        if (subTreeNode == null){
            return  subTreeNode;
        }
        
        if (value < subTreeNode.getData()){
            subTreeNode.setLeftChild(delete(subTreeNode.getLeftChild(), value));

        }else if (value > subTreeNode.getData()){
            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), value));

        }else {
            // case 1 and 2 node to delete has 0 or 1 child(ren)
            if (subTreeNode.getLeftChild() == null){
                return  subTreeNode.getRightChild();

            } else if (subTreeNode.getRightChild() == null) {
                return  subTreeNode.getLeftChild();
            }
        }

        return subTreeNode;
    }

    public int min(){
        if (root == null){
            return Integer.MIN_VALUE;
        }else {
            return root.min();
        }
    }

    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        }else {
            return root.max();
        }
    }
    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value){
        if (root != null){
            return root.get(value);
        }
        return  null;
    }
}
