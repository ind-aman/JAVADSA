import java.util.Arrays;

public class Recursion_CountTotalPathOfMaze {

    static int l1 =0;
    static int l2 =0;
    

    static int mazeCounter(Boolean[][] maze, Pair<Integer, Integer> source, Pair<Integer, Integer> dest){

        if(source.first == dest.first && source.second == dest.second) return 1;

        int count =0 ;

        if(source.first + 1 < l1  && maze[source.first+1][source.second]==false){
            
            maze[source.first+1][source.second] = true;
            
            
            count = count + mazeCounter(maze, new Pair<Integer,Integer>(source.first+1, source.second), dest);
            maze[source.first+1][source.second] = false;
        }

        // if (source.first-1>=0 && maze[source.first-1][source.second]==false) {
        //     maze[source.first-1][source.second] = true;
            
            
        //     count = count + mazeCounter(maze, new Pair<Integer,Integer>(source.first-1, source.second), dest);
        //     maze[source.first-1][source.second] = false;
        // }

         if (source.second + 1 < l2 && maze[source.first][source.second+1]==false) {
            maze[source.first][source.second+1] = true;
           
            
            count = count +mazeCounter(maze, new Pair<Integer,Integer>(source.first, source.second+1), dest);
            maze[source.first][source.second+1] = false;
        }

        //   if (source.second -1 >= 0 && maze[source.first][source.second-1]==false) {
        //     maze[source.first][source.second-1] = true;
           
            
        //     count = count + mazeCounter(maze, new Pair<Integer,Integer>(source.first, source.second-1), dest);
        //     maze[source.first][source.second-1] = false;
        // }

        

        
        return count;
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> source = new Pair<Integer,Integer>(0, 0);
        Pair<Integer, Integer> dest = new Pair<Integer,Integer>(0, 1);
        l1 = 1;
        l2 = 2;
        
        Boolean[][] maze =new Boolean[l1][l2];
        for(int i =0; i< l1; i++){
            Arrays.fill(maze[i], false);
        }
        maze[source.first][source.second] = true;
        
     System.out.println(mazeCounter(maze, source, dest));
        

    }
}


