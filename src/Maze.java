
public class Maze {

	int x_size;
	int y_size;
	char[][] grid;
	int[] startTile;
	int[] endTile;
	
	public void createGrid(int x,int y) {
		if(x!=0 & y!=0 & x%6==0 & y%6==0) {
			x_size = x;
			y_size = y;
			grid = new char[x][y];
		}
	}
	
	public void fillGrid() {
		for(char[] each : grid) {
			for(char item : each) {
				item = 'O';
			}
		}
	}
	
	public void randomTile() {
		
	}
	
	public void checkInGrid(int xOrY) {
		
	}
	
	public void checkIfFinish() {
		
	}
	
	
}
