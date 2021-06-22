package SelfPractice;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

    public static void main(String[] args) {
        int a[][] = new int[][]{{1,0,0},{1,0,0},{1,9,1}};

        int d = compute(a);

        System.out.println(d);

    }

    private static int compute(int[][] a) {

        boolean visited[][] = new boolean[3][3];
        Queue<Item> queue = new LinkedList();

        queue.add(new Item(0,0,0));

        visited[0][0]=true;
        int x,y;
        while (!queue.isEmpty()){
            Item item = queue.remove();
            x = item.x;
            y= item.y;
            if (a[x][y]==9){
                return item.dist;
            }
            System.out.println("Enter");

            if (validate(x,y-1,visited,a)){
                System.out.println("UP");
                visited[x][y-1]=true;
                queue.add(new Item(x,y-1, item.dist+1));
            }


            if (validate(x,y+1,visited,a)){
                System.out.println("UP");
                visited[x][y+1]=true;
                queue.add(new Item(x,y+1, item.dist+1));
            }

            if (validate(x-1,y,visited,a)){
                visited[x-1][y]=true;
                queue.add(new Item(x-1,y, item.dist+1));
            }

            if (validate(x+1,y,visited,a)){
                visited[x+1][y]=true;
                queue.add(new Item(x+1,y, item.dist+1));
            }

        }
        return -1;

    }

    static boolean validate(int x,int y, boolean visited[][],int a[][]){
        System.out.println("validate"+x+y);
        if (x>=0 && y>=0 && x<a.length && y<a[0].length && visited[x][y]==false && a[x][y]!=0){
            return true;
        }
        return false;

    }
}

class Item{

    int x;
    int y,dist;
    Item(int x , int y, int dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
}