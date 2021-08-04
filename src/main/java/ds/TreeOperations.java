package ds;

public class TreeOperations {
    public static void main(String[] args) {
        Tree tree = new Tree(20);

        tree = insertIntoTree(tree,23);
        tree = insertIntoTree(tree,25);
        tree = insertIntoTree(tree,13);
        tree = insertIntoTree(tree,53);
        tree = insertIntoTree(tree,27);

        System.out.println(tree.toString());

        boolean result = contains(tree,31);
        System.out.println(result);

        result = contains(tree,53);
        System.out.println(result);
    }

    private static boolean contains(Tree tree, int value) {
        if(tree.getValue() == value) return true;
        else if(value<tree.getValue() && tree.left != null) return contains(tree.getLeft(),value);
        else if(value> tree.getValue() && tree.right != null) return contains(tree.getRight(),value);
        return false;
    }

    private static Tree insertIntoTree(Tree tree, int value) {
        if(null == tree) return new Tree(value);
        else if (value < tree.getValue()){
            tree.left = insertIntoTree(tree.getLeft(),value);
        } else if (value > tree.getValue()) tree.right = insertIntoTree(tree.getRight(),value);
        else return tree;

        return tree;
    }
}
