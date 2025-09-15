package shape.builder.polygon;


import shape.builder.attributes.Area;
import shape.builder.attributes.Perimeter;
import shape.builder.graphics.Coordinates;
import shape.builder.graphics.Points;
import shape.builder.subtypes.QuadrilateralSubtypes;
import shape.builder.trigonometry.Law_of_Cosines;

public class Kite extends Quadrilaterals implements Coordinates, Law_of_Cosines {
	
	public QuadrilateralSubtypes quadType=QuadrilateralSubtypes.Kite;
	
	private double leftSidePair;
	private double rightSidePair;
	
	private double angle_1;
	private double angle_2;
	private double angle_3;
	private double angle_4;
	
	public static Area areaFormula = (values) ->values[0]*values[1]*Math.sin(Math.toRadians(values[2]));
	public static Perimeter perimeterFormula =(values) -> 2*(values[0] + values[1]);
	
	public Kite (double leftSidePair, double rightSidePair, double angle_2) {
		
		this.leftSidePair=leftSidePair;
		this.rightSidePair=rightSidePair;
		
		this.angle_2=angle_2;
		
		double horizontal=locSide(this.angle_2, this.leftSidePair, this.rightSidePair);
		
		this.angle_1=locAngle(rightSidePair, leftSidePair, horizontal);
		this.angle_3=locAngle(leftSidePair, rightSidePair,horizontal);
		this.angle_4=angle_2;
		
	 }
			
	/**
	 * @return the angle_4
	 */
	public double getAngle_4() {
		return this.angle_4;
	}
	/**
	 * @param angle_4 the angle_4 to set
	 */
	public void setAngle_4(double angle_4) {
		this.angle_4 = angle_4;
	}
	/**
	 * @return the angle_3
	 */
	public double getAngle_3() {
		return this.angle_3;
	}
	/**
	 * @param angle_3 the angle_3 to set
	 */
	public void setAngle_3(double angle_3) {
		this.angle_3 = angle_3;
	}
	/**
	 * @return the angle_2
	 */
	public double getAngle_2() {
		return this.angle_2;
	}
	/**
	 * @param angle_2 the angle_2 to set
	 */
	public void setAngle_2(double angle_2) {
		this.angle_2 = angle_2;
	}
	/**
	 * @return the angle_1
	 */
	public double getAngle_1() {
		return this.angle_1;
	}
	/**
	 * @param angle_1 the angle_1 to set
	 */
	public void setAngle_1(double angle_1) {
		this.angle_1 = angle_1;
	}
	/**
	 * @return the rightSidePair
	 */
	public double getRightSidePair() {
		return this.rightSidePair;
	}
	/**
	 * @param rightSidePair the rightSidePair to set
	 */
	public void setRightSidePair(double rightSidePair) {
		this.rightSidePair = rightSidePair;
	}
	/**
	 * @return the leftSidePair
	 */
	public double getLeftSidePair() {
		return this.leftSidePair;
	}
	/**
	 * @param leftSidePair the leftSidePair to set
	 */
	public void setLeftSidePair(double leftSidePair) {
		this.leftSidePair = leftSidePair;
	}
	
	
	@Override
	public String displayCoordinates(Points[] c) {
		// TODO Auto-generated method stub
		
		StringBuilder displayCoordinates= new StringBuilder();
		
		displayCoordinates.append("\t");
		displayCoordinates.append(c[1].toString());
		displayCoordinates.append("\n");
		displayCoordinates.append(c[0].toString());
		displayCoordinates.append("\t");
		displayCoordinates.append("\t");
		displayCoordinates.append(c[2].toString());
		displayCoordinates.append(" \n");
		displayCoordinates.append("\t");
		displayCoordinates.append(c[3].toString());
		displayCoordinates.append(" \n");
		
		
		return displayCoordinates.toString();
		
		
	}
	
	@Override
	public Points[] getCoordinates() {
		// TODO Auto-generated method stub
		double horizontal=locSide(this.angle_2, this.leftSidePair, this.rightSidePair);
		
		double midX=Points.getTopX(horizontal, this.leftSidePair, this.rightSidePair);
		
		double posY=Points.getTopX(horizontal, this.leftSidePair, this.rightSidePair);
		double negY=-posY;
		
		
		Points[] coordinates=new Points[this.numSides];
		
		coordinates[0]= new Points(0,0);
		coordinates[1]= new Points(midX,posY);
		coordinates[2]= new Points(horizontal,0);
		coordinates[3]= new Points(midX,negY);
		
		
		return  coordinates;
		
	}
	
	

	@Override
	public String toString() {
		
		StringBuilder kiteStr=new StringBuilder();
		
		kiteStr.append("Sides: \n");
		kiteStr.append("\t Left Pair OF Sides: ");
		kiteStr.append(this.leftSidePair);
		kiteStr.append("\n");
		kiteStr.append("\t Right PairOF Sides: ");
		kiteStr.append(this.rightSidePair);
		kiteStr.append("\n");
		kiteStr.append("\n");
		
		kiteStr.append("Angles: \n");
		kiteStr.append("\t angle_1: ");
		kiteStr.append(this.angle_1);
		kiteStr.append("\n");
		kiteStr.append("\t angle_2: ");
		kiteStr.append(this.angle_2);
		kiteStr.append("\n");
		kiteStr.append("\t angle_3: ");
		kiteStr.append(this.angle_3);
		kiteStr.append("\n");
		kiteStr.append("\t angle_4: ");
		kiteStr.append(this.angle_4);
		kiteStr.append("\n");
		kiteStr.append("\n");
		
		String displayCoordinates= this.displayCoordinates(this.getCoordinates());
		kiteStr.append(displayCoordinates);
		
		
		return kiteStr.toString();
	}
	

}