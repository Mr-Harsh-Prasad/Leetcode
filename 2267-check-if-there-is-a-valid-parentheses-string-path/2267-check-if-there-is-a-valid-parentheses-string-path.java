class Solution {
    int m, n;
    char[][] grid;
    boolean[][][] visited;

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        if ((m + n - 1) % 2 == 1) return false;
        if (grid[0][0] == ')') return false;
        if (grid[m - 1][n - 1] == '(') return false;

        visited = new boolean[m][n][m + n];

        return dfs(0, 0, 0);
    }

    private boolean dfs(int row, int col, int balance) {
        if (grid[row][col] == '(') {
            balance++;
        } else {
            balance--;
        }

        if (balance < 0) return false;

        int remaining = (m - row - 1) + (n - col - 1);

        if (balance > remaining) return false;

        if (row == m - 1 && col == n - 1) {
            return balance == 0;
        }

        if (visited[row][col][balance]) return false;

        visited[row][col][balance] = true;

        if (row + 1 < m && dfs(row + 1, col, balance)) {
            return true;
        }

        if (col + 1 < n && dfs(row, col + 1, balance)) {
            return true;
        }

        return false;
    }
}