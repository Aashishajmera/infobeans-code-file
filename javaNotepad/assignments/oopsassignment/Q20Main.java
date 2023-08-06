/* ***20)Create class Tile to store the edge length of a square tile , and create another class Floor
 to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor 
 class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely. */
 
 import java.util.Scanner;
class Tile{
	double lengthEdge;
	
	// calculate are of tile: 
	public void areaOfTile(double edge){
		lengthEdge = (edge*edge);
	}
}
 
class Floor{
	double length, width, areaOfTile, totalTile;
	
	// method
	public void totalTiles(Tile t, int length, int width){
		areaOfTile = (length*width);
		totalTile = areaOfTile/t.lengthEdge;
		System.out.println("Total tile is: "+totalTile);
	}
}
 
 
 
class Q20Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tile edge length: ");
		int tile = sc.nextInt();
		
		// create tile class object: 
		Tile obj = new Tile();
		obj.areaOfTile(tile);

		// create floor class object: 
		System.out.println("Enter floor length: ");
		int length = sc.nextInt();
		System.out.println("Enter floor width: ");
		int width = sc.nextInt();

		Floor obj1 = new Floor();
		obj1.totalTiles(obj,length,width);

	}
}
