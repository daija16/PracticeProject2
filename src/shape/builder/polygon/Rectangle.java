package shape.builder.polygon;

import shape.builder.graphics.Coordinates;
import shape.builder.graphics.Points;
import shape.builder.subtypes.QuadrilateralSubtypes;

public class Rectangle extends Parallelogram implements Coordinates {
	
	public QuadrilateralSubtypes quadType=QuadrilateralSubtypes.Rectangle;
	
	protected double interiorAngles=90;

	public Rectangle (double length, double width) {
		
		super(length, width);
		 
	 }


	public double getInteriorAngles() {
		return interiorAngles;
	}

	@Override
	public String displayCoordinates(Points[] c) {
		// TODO Auto-generated method stub

		StringBuilder displayCoordinates= new StringBuilder();
		
		
		displayCoordinates.append(c[1].toString());
		displayCoordinates.append("\t");
		displayCoordinates.append(c[2].toString());
		displayCoordinates.append("\n");
		displayCoordinates.append(c[0].toString());
		displayCoordinates.append("\t");
		displayCoordinates.append(c[3].toString());
		displayCoordinates.append(" \n");
		
		
		return displayCoordinates.toString();
	}
	
	@Override
	public Points[] getCoordinates() {
		// TODO Auto-generated method stub
		
		Points[] coordinates=new Points[this.numSides];
		

		coordinates[0]= new Points(0,0);
		coordinates[1]= new Points(0,this.width);
		coordinates[2]= new Points(this.length,this.width);
		coordinates[3]= new Points(this.length,0);
		
		
		return  coordinates;
	}
	
	@Override
	public String toString() {
		
		StringBuilder rectStr=new StringBuilder();
		
		rectStr.append("Sides: \n");
		rectStr.append("\t width: ");
		rectStr.append(this.width);
		rectStr.append("\n");
		rectStr.append("\t length: ");
		rectStr.append(this.length);
		rectStr.append("\n");
		rectStr.append("\n");
		rectStr.append("Angles: \n");
		rectStr.append("\t Interior Angles: ");
		rectStr.append(this.interiorAngles);
		rectStr.append("\n");
		rectStr.append("\n");
		
		String displayCoordinates= this.displayCoordinates(this.getCoordinates());
		rectStr.append(displayCoordinates);
		
		
		return rectStr.toString();
	}

}
