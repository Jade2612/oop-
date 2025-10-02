// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {

        // YOUR CODE HERE
        int r = grid.length;
        int c = grid[0].length;
        int startrow = r; int endrow = -1;
        int startcol = c; int endcol = -1;
        for (int i = 0; i < r;i++) {
            for (int j = 0; j < c;j++) {
                if (grid[i][j] == ch) {
                    if (i < startrow) startrow = i;
                    if (j < startcol) startcol = j;
                    if (i > endrow) endrow = i;
                    if (j > endcol) endcol = j;
                }
            }
        }
        if (endrow == -1) return 0;
        return (endrow - startrow + 1) * (endcol - startcol + 1);
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */

    private int leng(int i, int j, int dr, int dc, char ch) {
        int leng = 0;
        int row = i + dr;
        int col = j + dc;
        while (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == ch) {
            leng++;
            row += dr;
            col += dc;
        }
        return leng;
    }

	public int countPlus() {
        int count = 0;
        int r = grid.length;
        int c = grid[0].length;
        for (int i  = 0; i < r; i++) {
            for (int j  = 0; j < c; j++) {
                if (grid[i][j] == ' ') continue;
                    int up = leng(i,j,-1,0,grid[i][j]);
                    int down = leng(i,j,1,0,grid[i][j]);
                    int left = leng(i,j,0,-1,grid[i][j]);
                    int right = leng(i,j,0,1,grid[i][j]);
                    if (up >= 1 && down >= 1 && left >= 1 && right >= 1 && up == down && up == left && up == right) {
                        ++count;
                    }
            }
        }
        return count;
	}
}
