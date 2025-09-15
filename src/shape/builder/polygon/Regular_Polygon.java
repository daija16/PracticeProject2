package shape.builder.polygon;

import shape.builder.attributes.Area;
import shape.builder.attributes.Perimeter;
import shape.builder.graphics.Coordinates;
import shape.builder.graphics.Points;
import shape.builder.subtypes.PolygonSubtypes;

public class Regular_Polygon extends Polygons implements Coordinates {
	
	public PolygonSubtypes polyType=PolygonSubtypes.Regular_Polygon;
	
	private double sideLength;
	private double radius;
	private double apothem;
	
	private double interiorAngles;
	private double exteriorAngles;
	
	public static Area areaFormula= (values) -> 0.25*values[0]*Math.pow(values[1], 2)/Math.tan(Math.PI/values[0]);
	public static Perimeter perimeterFormula= (values) -> values[0]*values[1];
	//¼ × n × Side2 / tan(π/n)
	
	
	public Regular_Polygon (int numSides, double sideLength) {
		
		
		this.numSides=numSides;
		this.sideLength=sideLength;
		
		this.radius=2*Math.sin(Math.PI/this.numSides);
		this.apothem=getRadius()*Math.cos(Math.PI/this.numSides);
		
		this.interiorAngles=180-(360/this.numSides);
		this.exteriorAngles=180-this.interiorAngles;
		
	 }
	
	/**
	 * @return the exteriorAngles
	 */
	public double getExteriorAngles() {
		return this.exteriorAngles;
	}
	
	/**
	 * @return the interiorAngles
	 */
	public double getInteriorAngles() {
		return this.interiorAngles;
	}
	
	/**
	 * @return the apothem
	 */
	public double getApothem() {
		return this.apothem;
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**
	 * @return the sidelength
	 */
	public double getSideLength() {
		return this.sideLength;
	}

	/**
	 * @param sidelength the sidelength to set
	 */
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	/**
	 * 
	 * Side = 2 × Radius × sin(π/n)
	 * Side =  Radius × 2sin(π/n)
	 * Side/2sin(π/n) =  Radius
	 * 
	 * Side = 2 × Apothem × tan(π/n)
	 * Apothem = Radius × cos(π/n)
	 * 
	 * */
	
	
	@Override
	public String displayCoordinates(Points[] c) {
		// TODO Auto-generated method stub
		
		StringBuilder displayCoordinates= new StringBuilder();
		
		
		displayCoordinates.append(c[0].toString());
		displayCoordinates.append(" \n");
		
		
		return displayCoordinates.toString();
	}

	@Override
	public Points[] getCoordinates() {
		// TODO Auto-generated method stub
		
		
		double radians =(Math.PI*2)/this.numSides;
		double rotation =Math.PI/this.numSides;
		
		
		Points[] coordinates=new Points[this.numSides];
		
		
		double x;
		double y;
		
		
		for(int i=0; i>this.numSides;i++) {
			if(this.numSides%2==0) {
				
				x=(this.radius*Math.sin(radians*i)*Math.cos(rotation))-(this.radius*Math.cos(radians*i)*Math.sin(rotation));
				y=(this.radius*Math.sin(radians*i)*Math.sin(rotation))+(this.radius*Math.cos(radians*i)*Math.cos(rotation));
				
			} else {
				
				x=this.radius*Math.sin(radians*i);
				y=this.radius*Math.cos(radians*i);
			}
			
			coordinates[i]= new Points(x,y);
			
		}
		
		
		return  coordinates;
		
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder relpolyStr=new StringBuilder();
		
		
		relpolyStr.append(this.numSides);
		relpolyStr.append("-agon");
		relpolyStr.append("\n");
		relpolyStr.append("\n");
		relpolyStr.append("Side Length: ");
		relpolyStr.append(this.sideLength);
		relpolyStr.append("\n");
		relpolyStr.append("Radius: ");
		relpolyStr.append(this.radius);
		relpolyStr.append("\n");
		relpolyStr.append("Apothem: ");
		relpolyStr.append(this.apothem);
		relpolyStr.append("\n");
		relpolyStr.append("\n");
		relpolyStr.append("Angles: \n");
		relpolyStr.append("\t Interior Angles: ");
		relpolyStr.append(this.interiorAngles);
		relpolyStr.append("\n");
		relpolyStr.append("\t Exterior Angles: ");
		relpolyStr.append(this.exteriorAngles);
		relpolyStr.append("\n");
		relpolyStr.append("\n");
		
		String displayCoordinates= this.displayCoordinates(this.getCoordinates());
		relpolyStr.append(displayCoordinates);
		
		
		return relpolyStr.toString();
	}
	
	//Circumcircle, Incircle, Radius and Apothem
}
