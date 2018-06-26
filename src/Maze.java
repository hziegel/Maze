
public class Maze {

	int x;
	int y;
	int[][] grid;
	
	public void createGrid(int x,int y) {
		if(x!=0 & y!=0 & x%6==0 & y%6==0) {
			this.x = x;
			this.y = y;
			grid = new int[x][y];
		}
	}
	
	
	
}
