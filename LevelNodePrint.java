package SelfPractice;

class LevelNodePrint
{

    static class node
    {

        node left;
        node right;
        int data;
    }

    static node newNode(int data)
    {
        node temp = new node();

        temp.data = data;
        temp.left = null;
        temp.right = null;

        return temp;
    }

    static void PrintLeafNodes(node root, int level)
    {
        if (root == null)
        {
            return;
        }

        if (level == 1)
        {
            if (root.left == null && root.right == null)
            {
                System.out.print(root.data + " ");
            }

        }
        else if (level > 1)
        {
            PrintLeafNodes(root.left, level - 1);
            PrintLeafNodes(root.right, level - 1);
        }
    }

    static void alterntePrintNode(node root , int level , int counter){

        if (root == null)
            return;

        if(level == counter ){
            System.out.println(root.data);
        }
        else {
            alterntePrintNode(root.left,level,counter+1);
            alterntePrintNode(root.right,level,counter+1);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(6);
        root.right.right = newNode(4);
        root.left.left.left = newNode(8);
        root.left.left.right = newNode(7);

        int level = 4;
        alterntePrintNode(root,level,1);
        //PrintLeafNodes(root, level);
    }
}


