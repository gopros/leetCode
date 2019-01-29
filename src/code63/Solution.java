package code63;


class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if (obstacleGrid.length==0) return 0;

        int m= obstacleGrid.length,n = obstacleGrid[0].length;


        int[][] dp = new int[m][n];


        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if(obstacleGrid[i][j]==1){
                    dp[i][j] = 0;
                }else if(i==0&&j==0){
                    dp[i][j] = 1;
                }else if(i==0){
                    dp[i][j] = dp[i][j-1];
                }else if(j==0){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }



        return dp[m-1][n-1];
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};

        System.out.println(s.uniquePathsWithObstacles(mat));



    }



}
