public class Maze {
	// 0 = blank tile
	// 1 = solution path tile
	// 2 = generated path tile
	// 3 = start tile
	// 4 = end tile

	int x_size;
	int y_size;
	int[][] grid;
	int[] startTile;
	int[] endTile;
	
	public void createGrid(int x,int y) {
		if(x!=0 & y!=0 & x%6==0 & y%6==0) {
			x_size = x;
			y_size = y;
			grid = new int[x][y];
		}
	}
	
	public void fillGrid(int gridSize) {
		for(int[] each : grid) {
			for(int item : each) {
				grid[item] = 0;
			}
		}
	}
	
	public int[] randomTile() {
		return new int[]{Math.toIntExact(Math.round(Math.random()*Double.valueOf(x_size))),Math.toIntExact(Math.round(Math.random()*Double.valueOf(y_size)))};
	}
	
	public void checkIfInGrid(int xOrY) {
		
	}
	
	public void checkIfFinish() {
		 
	}
	
	public int[][] createMaze() {
		startTile = randomTile();
		endTile = randomTile();
		while(endTile == startTile) {
			endTile = randomTile();
		}
		
		return grid;
	}
	
	
}
