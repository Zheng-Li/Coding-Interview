package chapter_4;

import java.util.HashMap;
import java.util.List;

public class Test {
 
	//prtint out the maze from the array, replacing the empty space with '.'
	public void printMaze(char[][] maze) {
	    //Assuming the second dimensions have the same length
	    for(int i=0; i<maze.length; i++) {
	        for(int j=0; j<maze[0].length; j++) {
	            if(maze[i][j] == ' ') {
	                System.out.print(maze[i][j]);
	            } else {
	                System.out.print(".");
	            }
	        }
	        System.out.println();
	    }
	}

	//To find out the path from S to G, there must be recurssions.
	public void findPath(char[][] maze) {
	    //Find the path from the start point
	    for(int i=0; i<maze.length; i++) {
	        for(int j=0; j<maze[0].length; j++) {
	            if(maze[i][j] == 'S') {
	                isRightMove(maze, i, j);
	                //Remark the star point when we find the path
	                maze[i][j] = 'S';
	            } 
	        }
	    }
	}

	//In order to find the right move for the maze, we need a helper method to find the right move
	public boolean isRightMove(char[][] maze, int x, int y) {
	    //There's serveral possible situations: Outside maze; Hit wall; Available move; Goal;
	    
	    if(x<0 || x>maze.length-1 || y<0 || y>=maze[0].length-1) {
	        //Running outside the maze
	        return false;
	    }
	    
	    if(maze[x][y] == '#') {
	        //Hit the wall
	        return false;
	    }
	    
	    if(maze[x][y] == 'G') {
	        //Reach the goal
	        return true;
	    }
	    
	    //Available move for in the path, mark as "-"
	    maze[x][y] = '-';
	    
	    //Four directions at a point
	    if(isRightMove(maze, x-1, y)) {
	        return true;
	    } //Moving North
	    if(isRightMove(maze, x+1, y)) {
	        return true;
	    } //Moving South
	    if(isRightMove(maze, x, y-1)){
	        return true;
	    } //Moving West
	    if(isRightMove(maze, x, y+1)) {
	        return true;
	    } //Moving East
	    
	    //Unmark this move, it is available, but it is not the right move
	    maze[x][y] = ' ';
	    return false;
	}

	public void parse(List<String> list) {
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    
	    //Loop the list and delete the "ignore" directly
	    for(int i=0; i<list.size(); i++) {
	        String tmp = list.get(i);
	        if(tmp.equals("ignore")) {
	            list.remove(i);
	        }
	    }
	    
	    //Save the trimed list into HashMap
	    for(String tmp: list) {
	        if(!map.containsKey(tmp)) {
	            map.put(tmp, 1);
	        } else {
	            map.put(tmp, (Integer)map.get(tmp) + 1);
	        }
	    }
	    
	    System.out.println(list.toString());
	    System.out.println(map.toString());
	}

}
