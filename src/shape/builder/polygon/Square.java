package shape.builder.polygon;

import shape.builder.attributes.Area;
import shape.builder.attributes.Perimeter;
import shape.builder.graphics.Coordinates;
import shape.builder.graphics.Points;
import shape.builder.subtypes.QuadrilateralSubtypes;

public class Square extends Rectangle implements Coordinates {
	
	public QuadrilateralSubtypes quadType=QuadrilateralSubtypes.Square;
	
	private double sideLength;

	public static Area areaFormula=(values) -> Math.pow(values[0], 2);
	public static Perimeter perimeterFormula=(values) -> 4*values[0];
	
	public Square(double sideLength) {
		
		super(sideLength, sideLength);
		this.sideLength=sideLength;
		
	 }
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSidelength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	@Override
	public String displayCoordinates(Points[] c) {
		// TODO Auto-generated method stub

		StringBuilder displayCoordinates= new StringBuilder();
		
		
		displayCoordinates.append(c[1].toString());
		displayCoordinates.append(c[2].toString());
		displayCoordinates.append("\n");
		displayCoordinates.append(c[0].toString());
		displayCoordinates.append(c[3].toString());
		displayCoordinates.append(" \n");
		
		
		return displayCoordinates.toString();
	}
	
	@Override
	public Points[] getCoordinates() {
		// TODO Auto-generated method stub
		
		Points[] coordinates=new Points[this.numSides];
		

		coordinates[0]= new Points(0,0);
		coordinates[1]= new Points(0,this.sideLength);
		coordinates[2]= new Points(this.sideLength,this.sideLength);
		coordinates[3]= new Points(this.sideLength,0);
		
		
		return  coordinates;
	}
	
	@Override
	public String toString() {
		
		
		StringBuilder sqreStr=new StringBuilder();
		
		sqreStr.append("Side Length: ");
		sqreStr.append(this.sideLength);
		sqreStr.append("\n");
		sqreStr.append("\n");
		
		sqreStr.append("Angles: \n");
		sqreStr.append("\t Interior Angles: ");
		sqreStr.append(this.interiorAngles);
		sqreStr.append("\n");
		sqreStr.append("\n");
		
		String displayCoordinates= this.displayCoordinates(this.getCoordinates());
		sqreStr.append(displayCoordinates);
		
		
		return sqreStr.toString();
	}
}
