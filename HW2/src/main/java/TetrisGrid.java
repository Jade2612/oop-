//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
    boolean[][] grid;
	public TetrisGrid(boolean[][] grid) {
        int w = grid.length;
        int h = grid[0].length;
        this.grid = new boolean[w][h];
        for (int i = 0; i < w;i++) {
            System.arraycopy(grid[i], 0, this.grid[i], 0, h);
        }
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
        int r = grid.length;
        int c = grid[0].length;
        int newc = 0;
        boolean[][] newone = new  boolean[r][c];
        for (int i = 0; i < c;i++) {
            boolean check = true;
            for (int j = 0; j < r;j++) {
                if (!grid[j][i]) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                for (int t = 0; t < r;t++) {
                    newone[t][newc] = grid[t][i];
                }
                ++newc;
            }
        }
        grid = newone;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return this.grid; // YOUR CODE HERE
	}
}
