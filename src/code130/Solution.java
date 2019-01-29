package code130;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

    public void solve(char[][] board) {

        if (board.length==0||board[0].length==0) return;

        int[][] visit = new int[board.length][board[0].length];
        Stack<Position> stack = new Stack<>();


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]=='O'&&visit[i][j]==0){
                    List<Position> list = new ArrayList<>();
                    stack.push(new Position(i,j));
                    int flag = 0;
                    while (!stack.empty()){
                        Position position = stack.pop();
                        list.add(position);
                        visit[position.i][position.j]=1;
                        if (position.i==0||position.i==board.length-1||position.j==0||position.j==board[0].length-1) flag=1;

                        if (position.i-1>=0&&board[position.i-1][position.j]=='O'&&visit[position.i-1][position.j]==0) stack.push(new Position(position.i-1,position.j));
                        if (position.i+1<board.length&&board[position.i+1][position.j]=='O'&&visit[position.i+1][position.j]==0) stack.push(new Position(position.i+1,position.j));
                        if (position.j-1>=0&&board[position.i][position.j-1]=='O'&&visit[position.i][position.j-1]==0) stack.push(new Position(position.i,position.j-1));
                        if (position.j+1<board[0].length&&board[position.i][position.j+1]=='O'&&visit[position.i][position.j+1]==0) stack.push(new Position(position.i,position.j+1));


                    }

                    if (flag==0){
                        for (int k = 0; k < list.size(); k++) {
                            board[list.get(k).i][list.get(k).j] = 'X';
                        }
                    }

                }
            }
        }

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve(new char[][]{{'O','X','O'},{'X','O','X'},{'O','X','O'}});
        System.out.println();
    }



}

class Position{
    int i;
    int j;
    Position(int i, int j){
        this.i=i;
        this.j=j;
    }
}