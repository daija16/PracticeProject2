package shape.builder.polygon;

import shape.builder.attributes.Area;
import shape.builder.attributes.HuronsFormula;
import shape.builder.attributes.Perimeter;
import shape.builder.graphics.Coordinates;
import shape.builder.graphics.Points;
import shape.builder.subtypes.PolygonSubtypes;
import shape.builder.trigonometry.Law_of_Cosines;
import shape.builder.trigonometry.Law_of_Sines;
/*    
 *            angle_2
 *              /\
 *             /  \
 *            /    \
 *     side_1/      \side_2
 *          /        \
 *         /          \
 *        /____________\
 *   angle_1  side_3  angle_3
 *   
 */
public class Triangle extends Polygons implements Coordinates, HuronsFormula, Law_of_Sines, Law_of_Cosines {
	
	public PolygonSubtypes polyType=PolygonSubtypes.Triangle;
	
	protected int numSides=3;
	
	//a + b + c  
	//bh/2
	
	//Area areaFormula 
	//Perimeter perimeterFormula
	
	private double side_1;
	private double side_2;
	private double side_3;
	
	private double angle_1;
	private double angle_2;
	private double angle_3;

	
	private double height=getHuronSide(this.side_1, this.side_2,this.side_3);
	
	public static Area areaFormula= (values) -> values[0]*values[1]/2;
	public static Perimeter perimeterFormula = (values) -> values[0]+values[1]+values[2];
	
	public Triangle () {
		//Triangle.areaFormula;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		
		return this.height;
		
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
	 * @return the side_3
	 */
	public double getSide_3() {
		return this.side_3;
	}
	/**
	 * @param side_3 the side_3 to set
	 */
	public void setSide_3(double side_3) {
		this.side_3 = side_3;
	}
	/**
	 * @return the side_2
	 */
	public double getSide_2() {
		return this.side_2;
	}
	/**
	 * @param side_2 the side_2 to set
	 */
	public void setSide_2(double side_2) {
		this.side_2 = side_2;
	}
	/**
	 * @return the side_1
	 */
	public double getSide_1() {
		return this.side_1;
	}
	/**
	 * @param side_1 the side_1 to set
	 */
	public void setSide_1(double side_1) {
		this.side_1 = side_1;
	}
	
	
	
	public void sss(double side_1, double side_2, double side_3) {
		this.side_1=side_1;
		this.side_2=side_2;
		this.side_3=side_3;
		
		this.angle_1=locAngle(side_2,side_3,side_1);
		this.angle_2=locAngle(side_3,side_1,side_2);
		this.angle_3=locAngle(side_1,side_2,side_3);
	}
	
	public void sas(double side_1, double angle_2, double side_2) {
		this.side_1=side_1;
		this.angle_2=angle_2;
		this.side_2=side_2;
		
		this.side_3=locSide(angle_2,side_1,side_2);
		this.angle_1=losAngle(side_2,this.side_3,angle_2);
		this.angle_3=180-(angle_2+this.angle_1);
		
	}
	
	public void ssa(double side_1, double side_2, double angle_3) {
		this.side_1=side_1;
		this.side_2=side_2;
		this.angle_3=angle_3;
		
		this.angle_1=losAngle(side_2,side_1,angle_3);
		this.angle_2=180-(angle_3+this.angle_1);
		this.side_3=losSide(this.angle_2,side_1,angle_3);
	}
	
	public void asa(double angle_1, double side_1, double angle_2) {
		this.angle_1=angle_1;
		this.side_1=side_1;
		this.angle_2=angle_2;
		
		this.angle_3=180-(angle_2+angle_1);
		this.side_2=losSide(angle_1,side_1,this.angle_3);
		this.side_3=losSide(angle_2,side_1,this.angle_3);
		
	}
	
	public void aas(double angle_1, double angle_2, double side_2) {
		this.angle_1=angle_1;
		this.angle_2=angle_2;
		this.side_2=side_2;
		
		this.angle_3=180-(angle_2+angle_1);
		this.side_1=losSide(this.angle_3,side_2, angle_1);
		this.side_3=losSide(angle_2, side_2, angle_1);
		
		
	}
	
	public void aaa(double angle_1, double angle_2, double angle_3) {
		this.angle_1=angle_1;
		this.angle_2=angle_2;
		this.angle_3=angle_3;
		
		//this.side_1=0;
		//this.side_2=0;
		//this.side_3=0;
	}
	
	
	
	
	@Override
	public Points[] getCoordinates() {
		// TODO Auto-generated method stub
		
		double x=Points.getTopX(this.side_3, this.side_1, this.side_2);
		double y=Points.getTopY(this.side_3, this.side_1, this.side_2);
		
		Points[] coordinates=new Points[this.numSides];
		
		coordinates[0]= new Points(0,0);
		coordinates[1]= new Points(x,y);
		coordinates[2]= new Points(0,this.side_3);
		
		return  coordinates;
		
	}


	@Override
	public String displayCoordinates(Points[] c) {
		// TODO Auto-generated method stub
		StringBuilder displayCoordinates= new StringBuilder();
		 
		displayCoordinates.append("\t");
		displayCoordinates.append(c[1].toString());
		//displayCoordinates.append("\n\n");
		displayCoordinates.append(" \n");
		displayCoordinates.append(c[0].toString());
		displayCoordinates.append("\t");
		displayCoordinates.append(c[2].toString());
		displayCoordinates.append("\n");
		
		return displayCoordinates.toString();
	}

	
	@Override
	public String toString() {
		StringBuilder triStr=new StringBuilder();
		
		triStr.append("Sides: \n");
		triStr.append("\t side_1: ");
		triStr.append(this.side_1);
		triStr.append("\n");
		triStr.append("\t side_2: ");
		triStr.append(this.side_2);
		triStr.append("\n");
		triStr.append("\t side_3: ");
		triStr.append(this.side_3);
		triStr.append("\n");
		triStr.append("\n");
		
		triStr.append("Angles: \n");
		triStr.append("\t angle_1: ");
		triStr.append(this.angle_1);
		triStr.append("\n");
		triStr.append("\t angle_2: ");
		triStr.append(this.angle_2);
		triStr.append("\n");
		triStr.append("\t angle_3: ");
		triStr.append(this.angle_3);
		triStr.append("\n");
		triStr.append("\n");
		
		String displayCoordinates= this.displayCoordinates(this.getCoordinates());
		triStr.append(displayCoordinates);
		
		
		return triStr.toString();
	}
	
	@Override
	public boolean equals (Object obj) {
		Triangle tri=(Triangle) obj;
		tri.getSide_1();
		
		
		return false;
		}

	
	
}
