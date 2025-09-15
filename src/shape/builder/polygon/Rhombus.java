package shape.builder.polygon;

import shape.builder.attributes.Area;
import shape.builder.attributes.Perimeter;
import shape.builder.graphics.Coordinates;
import shape.builder.graphics.Points;
import shape.builder.subtypes.QuadrilateralSubtypes;

public class Rhombus extends Parallelogram implements Coordinates {
	
	public QuadrilateralSubtypes quadType=QuadrilateralSubtypes.Rhombus;
	
	private double sideLength;

	
	public static Area areaFormula= (values) -> Math.pow(values[0], 2)*Math.sin(Math.toRadians(values[1]));
	public static Perimeter perimeterFormula= (values) -> 4*values[0];
	// s2 sin(A)
	
	
	public Rhombus (double sideLength, double anglePair_1) {
		
		super(sideLength, sideLength, anglePair_1);
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
		
		displayCoordinates.append("\t");
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
		
		
		Points[] coordinates=super.getCoordinates();
		
		
		return  coordinates;
	}
	
	@Override
	public String toString() {
		
		StringBuilder rombStr=new StringBuilder();
		
		rombStr.append("Side Length: ");
		rombStr.append(this.sideLength);
		rombStr.append("\n");
		rombStr.append("\n");
		
		rombStr.append("Angles: \n");
		rombStr.append("\t anglePair_1: ");
		rombStr.append(this.anglePair_1);
		rombStr.append("\n");
		rombStr.append("\t anglePair_2: ");
		rombStr.append(this.anglePair_2);
		rombStr.append("\n");
		rombStr.append("\n");
		
		String displayCoordinates= this.displayCoordinates(this.getCoordinates());
		rombStr.append(displayCoordinates);
		
		
		return rombStr.toString();
	}
}

