package shape.builder.polygon;

import shape.builder.attributes.Area;
import shape.builder.attributes.HuronsFormula;
import shape.builder.attributes.Perimeter;
import shape.builder.graphics.Coordinates;
import shape.builder.graphics.Points;
import shape.builder.subtypes.QuadrilateralSubtypes;
import shape.builder.trigonometry.Law_of_Sines;
import shape.builder.trigonometry.Pythagorean;


/*  
 *                
 *                B__________C
 *                /|        |\
 *               / |        | \
 *              /  |        |  \
 *             /   |        |   \
 *            /____|________|____\
 *           A                    D
 * 
 *       
 *            B_____________C
 *            |            |\
 *            |            | \
 *            |            |  \
 *            |            |   \
 *            |____________|____\
 *            A                 D
 *                 
 *       
 *            B________________C
 *            |\    |         |\
 *            | \   |         | \
 *            |  \  |         |  \
 *            |   \ |         |   \
 *            |    \|_________|____\
 *                  A              D
 */

public class Trapezoid extends Quadrilaterals implements Coordinates, HuronsFormula, Pythagorean, Law_of_Sines {
	
	public QuadrilateralSubtypes quadType=QuadrilateralSubtypes.Trapezoid;
	
	private double leg_1;
	private double base_1;
	private double leg_2;
	private double base_2;
	
	private double angle_1;
	private double angle_2;
	private double angle_3;
	private double angle_4;
	
	private double height=getHuronSide((this.base_2-this.base_1), this.leg_2,this.leg_1);;
	
	public static Area areaFormula= (values) ->((values[0]+values[1])/2)*values[2];
	public static Perimeter perimeterFormula= (values) -> values[0]+values[1]+values[2]+values[3];
	//
	
	public Trapezoid (double leg_1, double base_1, double leg_2, double base_2) {
		
		this.leg_1= leg_1;	
		this.base_1=base_1;	
		this.leg_2=leg_2;
		this.base_2= base_2;
		
		
		double left =pythagoreanSide(this.height,this.leg_1);
		double right =pythagoreanSide(this.height,this.leg_2);
		
		
		if((this.height==this.leg_1)||(this.height==this.leg_2)) {
			if(this.height==this.leg_1) {
				
				this.angle_1=90;
				this.angle_2=90;
				this.angle_3=90+losSide(right, this.leg_2, 90);
				this.angle_4=losSide(this.height, this.leg_2, 90);
				
			} else if(this.height==this.leg_2) {
				
				this.angle_1=losSide(this.height, this.leg_1, 90);
				this.angle_2=90+losSide(left, this.leg_1, 90);
				this.angle_3=90;
				this.angle_4=90;
				
			}
		
		} else if((base_2==(right+this.base_1-left))||(base_2==(left+this.base_1-right))) {
			if(base_2==(right+this.base_1-left)){
				
				this.angle_1=90+losSide(left, this.leg_1, 90);
				this.angle_2=losSide(this.height, this.leg_1, 90);
				this.angle_3=90+losSide(right, this.leg_2, 90);
				this.angle_4=losSide(this.height, this.leg_2, 90);
				
			} else if(base_2==(left+this.base_1-right)) {
				
				this.angle_1=losSide(this.height, this.leg_1, 90);
				this.angle_2=90+losSide(left, this.leg_1, 90);
				this.angle_3=losSide(this.height, this.leg_2, 90);
				this.angle_4=90+losSide(right, this.leg_2, 90);
				
			}
				
		} else {
			
			this.angle_1=losSide(this.height, this.leg_1, 90);
			this.angle_2=90+losSide(left, this.leg_1, 90);
			this.angle_3=90+losSide(right, this.leg_2, 90);
			this.angle_4=losSide(this.height, this.leg_2, 90);
		
		}
		//(()||())
		
	
	 }
	//(a+b/2)h
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
	 * @return the base_2
	 */
	public double getBase_2() {
		return this.base_2;
	}
	/**
	 * @param base_2 the base_2 to set
	 */
	public void setBase_2(double base_2) {
		this.base_2 = base_2;
	}
	/**
	 * @return the leg_2
	 */
	public double getLeg_2() {
		return this.leg_2;
	}
	/**
	 * @param leg_2 the leg_2 to set
	 */
	public void setLeg_2(double leg_2) {
		this.leg_2 = leg_2;
	}
	/**
	 * @return the base_1
	 */
	public double getBase_1() {
		return this.base_1;
	}
	/**
	 * @param base_1 the base_1 to set
	 */
	public void setBase_1(double base_1) {
		this.base_1 = base_1;
	}
	/**
	 * @return the leg_1
	 */
	public double getLeg_1() {
		return this.leg_1;
	}
	/**
	 * @param leg_1 the leg_1 to set
	 */
	public void setLeg_1(double leg_1) {
		this.leg_1 = leg_1;
	}
	/**
	 * @return the altitude
	 */
	
	public double getHeight() {
		
		
		return this.height;
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
		displayCoordinates.append("\t");
		displayCoordinates.append("\t");
		displayCoordinates.append(c[3].toString());
		displayCoordinates.append(" \n");
		
		
		return displayCoordinates.toString();
		
	}
	
	@Override
	public Points[] getCoordinates() {
		// TODO Auto-generated method stub
		
		double left =pythagoreanSide(this.height,this.leg_1);
		double right =pythagoreanSide(this.height,this.leg_2);
		double bottom =left+this.base_1+right;
		 
		double x_1;
		double x_2;
		
		if(bottom<this.base_2) {
			if((this.height==this.leg_1)) {
				x_1=0;
				x_2=0;
			} else {
				x_1=left;
				x_2=0;
			}
		} else {
			x_1=0;
			x_2=left;
		}
		
		double x_3=x_2+this.base_1;
		double x_4=x_1+this.base_2;
		
		Points[] coordinates=new Points[this.numSides];
		
		coordinates[0]= new Points(x_1,0);
		coordinates[1]= new Points(x_2,this.height);
		coordinates[2]= new Points(x_3,this.height);
		coordinates[3]= new Points(x_4,0);
		
		
		return  coordinates;
		
	}
	
	@Override
	public String toString() {
		StringBuilder trapStr=new StringBuilder();
		
		trapStr.append("Sides: \n");
		trapStr.append("\t leg_1: ");
		trapStr.append(this.leg_1);
		trapStr.append("\n");
		trapStr.append("\t base_1: ");
		trapStr.append(this.base_1);
		trapStr.append("\n");
		trapStr.append("\t leg_2: ");
		trapStr.append(this.leg_2);
		trapStr.append("\n");
		trapStr.append("\t base_2: ");
		trapStr.append(this.base_2);
		trapStr.append("\n");
		trapStr.append("\n");
		
		trapStr.append("Angles: \n");
		trapStr.append("\t angle_1: ");
		trapStr.append(this.angle_1);
		trapStr.append("\n");
		trapStr.append("\t angle_2: ");
		trapStr.append(this.angle_2);
		trapStr.append("\n");
		trapStr.append("\t angle_3: ");
		trapStr.append(this.angle_3);
		trapStr.append("\n");
		trapStr.append("\t angle_4: ");
		trapStr.append(this.angle_4);
		trapStr.append("\n");
		trapStr.append("\n");
		
		String displayCoordinates= this.displayCoordinates(this.getCoordinates());
		trapStr.append(displayCoordinates);
		
		
		return trapStr.toString();
	}
	
	
}
