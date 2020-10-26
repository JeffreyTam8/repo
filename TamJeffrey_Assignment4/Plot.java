/**
 * Assignment 4 Plot
 * 10/25/20
 * CRN: 21599
 * This creates the Plot object and records its coordinates and measurements in 2d
 * @author Jeffrey Tam
 *
 */

public class Plot {
	
	private int x;		//Holds x coordinate of the plot
	private int y;		//Holds y coordinate of the plot
	private int width;	//Holds the width of the plot
	private int depth;	//Holds the depth of the plot
	
	/**
	 * No argument constructor, creates a default plot art (0,0) with the width and depth of 1
	 */
	Plot(){
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	/**
	 * One Plot parameter constructor, creates a Plot object based on one Plot object
	 * @param p
	 */
	Plot(Plot p) {
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}
	
	/**
	 * Four argument parameter constructor, creates a Plot object based on the four integers 
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	Plot(int x, int y, int width, int depth){
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	/**
	 * This method checks if the two plots layed out are overlapping
	 * @param plot
	 * @return 
	 */
	public boolean overlaps(Plot plot) {
		//If the plot mets all but last condition, the method will return a true boolean value, 
		//True meaning the plots do over lap, otherwise, the plots do not overlap
		if(x == plot.x && y == plot.y) {
			return true;
		}else if(x < (plot.x + plot.width) && (x + width) > (plot.x + plot.width)  && y < (plot.y + plot.depth) && (y + depth) > (plot.y + plot.depth)) {
			return true;
		}else if(x < plot.x && x + width > plot.x && y < plot.y && y + depth > plot.y){
			return true;
		}else if((x + width) > plot.x && (x + width) < (plot.x + plot.width) && (plot.y < y) && (plot.y + depth) > y){
			return true;
		}else if((plot.x + plot.width) > x && (plot.x + plot.width) < x + width && plot.y > y && plot.y < y + depth){
			return true;
		}else if(plot.x > x && plot.x < x + width && plot.y + depth < y + depth && plot.y + plot.depth > y) {
			return true;
		}else if(plot.x + plot.width < x + width && plot.x + plot.width > x && plot.y + plot.depth > y + depth && plot.y < y+depth){
			return true;
			
		}else{
			return false;
		}
	}
	
	/**
	 * This methods checks if the plots are inside of one another
	 * @param plot
	 * @return
	 */
	public boolean encompasses(Plot plot) {
		//This returns true if the plot argument is within the bounds of the plot
		//Otherwise, it returns false
		if(plot.x <= x + width && plot.x >= x && plot.x + plot.width <= x + width && plot.x + plot.width >= x 
		&& plot.y <= y + depth && plot.y >= y && plot.y + plot.depth <= y + depth && plot.y + plot.depth >= y) {
			return true;
		}
		return false;
	}
	
	/**
	 * This changes the plot object's x value to the argument
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Returns the x value of the plot
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Changes the plot's object y value to the argument
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Returns the y value of the plot
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Changes the plot's object width value to the argument
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Returns the width value of the plot
	 * @return width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Changes the plot's object depth value to the argument
	 * @param depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	/**
	 * Returns the depth value of the plot
	 * @return depth
	 */
	public int getDepth() {
		return depth;
	}
	
	/**
	 * Turns the information of the plot into a String format 
	 */
	public String toString() {
		
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}
}
