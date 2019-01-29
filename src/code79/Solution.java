package code79;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public boolean exist(char[][] board, String word) {

        if (word.length()==0) return true;
        if (board.length==0) return false;
        if (board[0].length==0) return false;

        List<Point> points = new ArrayList<>();
        int[][] visited = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==word.charAt(0)){
                    points.add(new Point(i,j));
                }
            }
        }

        for (int i = 0; i < points.size(); i++) {
            visited = new int[board.length][board[0].length];
            int x = points.get(i).x,y = points.get(i).y;
            visited[x][y] = 1;
            if (DFS(board,word,x,y,1,visited)) return true;
        }

        return false;



    }

    public boolean DFS(char[][] board, String word,int x, int y,int pos,int[][] visited){

        if (pos==word.length()){
            return true;
        }

        if (x-1>=0&&visited[x-1][y]==0){
            if (board[x-1][y]==word.charAt(pos)){
                visited[x-1][y] = 1;
                 if (DFS(board,word,x-1,y,pos+1,visited)) return true;
                visited[x-1][y] = 0;
            }
        }
        if (x+1<board.length&&visited[x+1][y]==0){
            if (board[x+1][y]==word.charAt(pos)){
                visited[x+1][y] = 1;
                if (DFS(board,word,x+1,y,pos+1,visited)) return true;
                visited[x+1][y] = 0;
            }
        }
        if (y-1>=0&&visited[x][y-1]==0){
            if (board[x][y-1]==word.charAt(pos)){
                visited[x][y-1] = 1;
                if (DFS(board,word,x,y-1,pos+1,visited)) return true;
                visited[x][y-1] = 0;
            }
        }
        if (y+1<board[0].length&&visited[x][y+1]==0){
            if (board[x][y+1]==word.charAt(pos)){
                visited[x][y+1] = 1;
                if (DFS(board,word,x,y+1,pos+1,visited)) return true;
                visited[x][y+1] = 0;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        Solution s = new Solution();
        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
//        char[][] board = {{'A','C','D','E'},{'A','C','F','A'}};
        System.out.println(s.exist(board,"ABCESEFSADEE"));

    }



}

class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}