import sun.reflect.generics.tree.Tree;

public class binarytree {
    static class Tree {

        int value;
        Tree right;
        Tree left;

        public Tree(int value) {
            this.value = value;
        }

        public Tree(int value, Tree right, Tree left) {
            this.value = value;
            this.right = right;
            this.left = left;
        }


    }

    static int countNodes(Tree node) {
        if (node == null)
            return 0;
        else return 1 + countNodes(node.left) + countNodes(node.right);
    }

    static int height(Tree node) {
        if (node == null)
            return -1;
        else return 1+Math.max(height(node.right),height(node.left));
    }


    public static void main(String[] args) {

        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4,null,new Tree(6)),new Tree(9)),
                new Tree(35,
                        new Tree(31,new Tree(28),null),
                new Tree(40,new Tree(38),new Tree(52))));

        System.out.println(countNodes(root));
        System.out.println(height(root));

    }
//       static class Tree{
//            public Tree(int value, Tree left, Tree right) {
//                this.value = value;
//                this.left = left;
//                this.right = right;
//            }
//            int value;
//            Tree left;
//            Tree right;
//
//            public Tree(int value){
//                this.value=value;
//        }
//        public int sum(){
//                int sum=value;
//                if(left!=null)
//                    sum+=left.sum();
//                if(right!=null)
//                    sum+= right.sum();
//        return sum;
//            }
//
//    }


    }

