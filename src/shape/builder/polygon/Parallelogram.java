package shape.builder.polygon;


import shape.builder.attributes.Area;
import shape.builder.attributes.Perimeter;
import shape.builder.graphics.Coordinates;
import shape.builder.graphics.Points;
import shape.builder.subtypes.QuadrilateralSubtypes;
import shape.builder.trigonometry.Law_of_Sines;
import shape.builder.trigonometry.Pythagorean;

public class Parallelogram extends Quadrilaterals implements Coordinates, Pythagorean, Law_of_Sines {

	public QuadrilateralSubtypes quadType=QuadrilateralSubtypes.Parallelogram;
	
	protected double length;
	protected double width;
	
	protected double anglePair_1;
	protected double anglePair_2;
	
	protected double height=losSide(this.anglePair_1, this.width, 90);
			
	public static Area areaFormula=(values) -> values[0]*values[1];
	public static Perimeter perimeterFormula=(values) -> 2*(values[0] + values[1]);
	
	public Parallelogram(double length, double width, double anglePair_1) {
		
		this.length=length;  
		this.width=width;  
		this.anglePair_1=anglePair_1; 
		this.anglePair_2=180-anglePair_1;
	 }
	
	public Parallelogram (double length, double width) {

		this.length=length;  
		this.width=width;
	}
	
	public Parallelogram() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the anglePair_2
	 */
	public double getAnglePair_2() {
		return this.anglePair_2;
	}
	/**
	 * @param anglePair_2 the anglePair_2 to set
	 */
	public void setAnglePair_2(double anglePair_2) {
		this.anglePair_2 = anglePair_2;
	}
	/**
	 * @return the anglePair_1
	 */
	public double getAnglePair_1() {
		return this.anglePair_1;
	}
	/**
	 * @param anglePair_1 the anglePair_1 to set
	 */
	public void setAnglePair_1(double anglePair_1) {
		this.anglePair_1 = anglePair_1;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return this.width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return this.length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getHeight() {
		return this.height;
	
	}
	
	
	@Override
	public String displayCoordinates(Points[] c) {
		// TODO Auto-generated method stub

		StringBuilder displayCoordinates= new StringBuilder();
		
		displayCoordinates.append("\t");
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
		
		
		double leftTopX = pythagoreanSide(this.height,this.width);
		double rightTopX = leftTopX+this.length;
		
		double x_1;
		double x_2;
		
		if(this.anglePair_1>90) {
			x_1=0;
			x_2=-leftTopX;	
		} else {
			x_1=0;
			x_2=leftTopX;
		}
		
		double x_3= rightTopX;
		double x_4=this.length;
		
		Points[] coordinates=new Points[this.numSides];
		

		coordinates[0]= new Points(x_1,0);
		coordinates[1]= new Points(x_2,this.height);
		coordinates[2]= new Points(x_3,this.height);
		coordinates[3]= new Points(x_4,0);
		
		
		return  coordinates;
	}
	
	@Override
	public String toString() {
		
		StringBuilder parallelStr=new StringBuilder();
		
		parallelStr.append("Sides: \n");
		parallelStr.append("\t width: ");
		parallelStr.append(this.width);
		parallelStr.append("\n");
		parallelStr.append("\t length: ");
		parallelStr.append(this.length);
		parallelStr.append("\n");
		parallelStr.append("\n");
		
		parallelStr.append("Angles: \n");
		parallelStr.append("\t anglePair_1: ");
		parallelStr.append(this.anglePair_1);
		parallelStr.append("\n");
		parallelStr.append("\t anglePair_2: ");
		parallelStr.append(this.anglePair_2);

		parallelStr.append("\n");
		parallelStr.append("\n");
		
		String displayCoordinates= this.displayCoordinates(this.getCoordinates());
		parallelStr.append(displayCoordinates);
		
		
		return parallelStr.toString();
	}
	

}
