package recursion;

import java.util.ArrayList;

public class Robot_Grid {
	public static boolean robotGrid(int[][] grid, ArrayList<Point> buffer, int X, int Y){
        Point pt = new Point(X, Y);
        buffer.add(pt);
         
        if(X == 0 && Y == 0){
            printBuffer(buffer);
            return true;
        }
         
        if(X >=1 && grid[X-1][Y] != -1){
            ArrayList<Point> c1 = new ArrayList<Point>();
            c1.addAll(buffer);
            robotGrid(grid, c1, X-1, Y);
        }
         
        if(Y >=1 && grid[X][Y-1] != -1){
            ArrayList<Point> c2 = new ArrayList<Point>();
            c2.addAll(buffer);
            robotGrid(grid, c2, X, Y-1);
        }
         
        return false;
    }
public static void printBuffer(ArrayList<Point> bf){
        for(Point p: bf){
            System.out.print("("+p.getX()+", "+p.getY()+") ");
        }
        System.out.println();
    }
 
public static void main(String[] args) {
         
        int[][] robotGrid = {
                {0,  0,   0,   0},
                {0,  0,   0,   0},
                {0, -1,   0,   0},
                {0,  0,   0,   0}
        };
        ArrayList<Point> buffer= new ArrayList<Point>();
        robotGrid(robotGrid, buffer, 3, 3);
    }
 
 
	
}
