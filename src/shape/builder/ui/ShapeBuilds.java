package shape.builder.ui;

//ShapeValues
//ShapeStrings

import shape.builder.polygon.Kite;
import shape.builder.polygon.Parallelogram;
import shape.builder.polygon.Rectangle;
import shape.builder.polygon.Regular_Polygon;
import shape.builder.polygon.Rhombus;
import shape.builder.polygon.Square;
import shape.builder.polygon.Trapezoid;
import shape.builder.polygon.Triangle;
import shape.builder.round.Circle;
import shape.builder.round.Ellipses;

//import shape.builder.ui.Console;

public class ShapeBuilds {
	
	/*
	 * first second third fourth
	
	Regular_Polygon
	
	Kite,
	Trapezoid,
	Parallelogram,
	Rhombus,
	Rectangle,
	Square
	
	Ellipse,
	Circle
	 * 
	 * 
	 * @return
	 */
	
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
	
	/*    
	 *          B
	 *         /\
	 *        /  \
	 *      c/    \a
	 *      /      \
	 *     /________\
	 *    A     b    C
	 *    
	 *        
	 *           # # #
	 *       # #       # #
	 *       #           # 
	 *     #               #
	 *     #       ________#
	 *     #       radius  #
	 *       #           #
	 *       # #       # #
	 *           # # #
	 *      
	 *      
	 *             # # # #
	 *         # #    |    # #
	 *       #   semi-|        # 
	 *     #  Minor-Axis         #
	 *     #          |__________#
	 *     #           semi-     #
	 *       #      Major-Axis #
	 *         # #         # #
	 *             # # # #
	 *      
	 *   
	 *         semi-
	 *      Major-Axis;
		this.
		   
	 *      
	 *      
	 *      
	 *      
	 *       
	 */
	
	public static Triangle buildTriangle() {
        
		Triangle triangle=new Triangle ();
		
		String triName =Console.getString("Please Enter the Name you wish to Use: ");
		
		
		StringBuilder displayTriangleType = new StringBuilder();
		
		displayTriangleType.append("Pick the set of Values you wish to Enter: \n");
		String displayTriangle = ShapeStrings.displayTriangle();
		displayTriangleType.append(displayTriangle);
		displayTriangleType.append("Pick the Type of Triangle you wish to make: \n");
		displayTriangleType.append("\nsss      sas      ssa      asa      aas      aaa\n");
		
		String triType =Console.getString(displayTriangleType.toString());
		
		switch(triType.toLowerCase()) {
			case "sss":
				double sss_1=Console.getSide("A");
				double sss_2=Console.getSide("B");
				double sss_3=Console.getSide("C");
				
				triangle.sss(sss_1, sss_2, sss_3);
				break;
			case "sas":
				double sas_1=Console.getSide("C");
				double sas_2=Console.getAngle("B");
				double sas_3=Console.getSide("A");
				
				triangle.sas(sas_1, sas_2, sas_3);
				break;
			case "ssa":
				double ssa_1=Console.getSide("A");
				double ssa_2=Console.getSide("B");
				double ssa_3=Console.getAngle("C");
				
				triangle.ssa(ssa_1, ssa_2, ssa_3);
				break;
			case "asa":
				double asa_1=Console.getAngle("A");
				double asa_2=Console.getSide("A");
				double asa_3=Console.getAngle("B");
				
				triangle.ssa(asa_1, asa_2, asa_3);
				break;	
			case "aas":
				double aas_1=Console.getAngle("A");
				double aas_2=Console.getAngle("B");
				double aas_3=Console.getSide("B");
				
				triangle.aas(aas_1, aas_2, aas_3);
				break;
			
			case "aaa":
				double aaa_1=Console.getAngle("A");
				double aaa_2=Console.getAngle("B");
				double aaa_3=Console.getAngle("C");
				
				triangle.aaa(aaa_1, aaa_2, aaa_3);
				break;
			
		}
		
		triangle.setName(triName);
        return triangle;
    
	}

	public static Trapezoid buildTrapezoid() {
		
		String trapName =Console.getString("Please Enter the Name you wish to Use: ");
		
		
		System.out.println("Enter the values listed below: \n");
		
		String displayTrapezoid = ShapeStrings.displayTrapezoid();
		
		System.out.println(displayTrapezoid);
		
		double leg_1=Console.getLeg(1);
		double base_1=Console.getBase(1);
		double leg_2=Console.getLeg(2);
		double base_2=Console.getBase(2);
		
		Trapezoid trapezoid=new Trapezoid (leg_1,base_1,leg_2,base_2);
		
		
		trapezoid.setName(trapName);
		
		return trapezoid;
		
	}
	
	public static Kite buildKite() {
		
		
		 
		/*  
		 *            angle
		 *             /\
		 *            /  \
		 * left_side /    \right_side
		 *          /      \
		 *         /        \
		 *         \        /
		 *          \      /
		 *           \    /
		 *            \  /
		 *             \/
		 *       
		 */
		String kiteName =Console.getString("Please Enter the Name you wish to Use: ");
		
		System.out.println("Enter the values listed below: \n");
		
		String displayKite = ShapeStrings.displayKite();
		
		System.out.println(displayKite);
		
		double leftSidePair=Console.getSidePair("Left");
		double rightSidePair=Console.getSidePair("Right");
		double angle=Console.getAngle();
		
		Kite kite=new Kite (leftSidePair, rightSidePair, angle);
		
		kite.setName(kiteName);
		
		return kite;
		
	}
	
	public static Parallelogram buildParallelogram() {
		
		
		 
		/*  
		 *                length
		 *           _________________
		 *          /                 /
		 *    width/                 /
		 *        /                 /
		 *       /                 /
		 *      /_________________/
		 * angle_pair_1    
		 *         
		 *       
		 */
		String parallelName =Console.getString("Please Enter the Name you wish to Use: ");
		
		System.out.println("Enter the values listed below: \n");
		
		String displayParallelogram = ShapeStrings.displayParallelogram();
		
		System.out.println(displayParallelogram);
		
		double length=Console.getLength();
		double width=Console.getWidth();
		double anglePair_1=Console.getAnglePair("first");
		
		Parallelogram parallelogram=new Parallelogram (length, width, anglePair_1);
		
		parallelogram.setName(parallelName);
		return parallelogram;
		
	}
	
	public static Rectangle buildRectangle() {
		
		
		 
		/*  
		 *                length
		 *           _________________
		 *          /                 /
		 *    width/                 /
		 *        /                 /
		 *       /                 /
		 *      /_________________/
		 * angle_pair_1    
		 *         
		 *       
		 */
		String rectName =Console.getString("Please Enter the Name you wish to Use: ");
		
		System.out.println("Enter the values listed below: \n");
		
		String displayRectangle = ShapeStrings.displayRectangle();
		
		System.out.println(displayRectangle);
		
		double length=Console.getLength();
		double width=Console.getWidth();
		
		Rectangle rectangle=new Rectangle (length, width);
		
		rectangle.setName(rectName);
		
		return rectangle;
		
	}
	
	public static Rhombus buildRhombus() {
		
		
		 
		/*  
		 *                length
		 *           _________________
		 *          /                 /
		 *    width/                 /
		 *        /                 /
		 *       /                 /
		 *      /_________________/
		 * angle_pair_1    
		 *         
		 *       
		 */
		String displayRhombus = ShapeStrings.displayRhombus();
		
		String rhombName =Console.getString("Please Enter the Name you wish to Use: ");
		
		System.out.println("Enter the values listed below: \n");
		
		System.out.println(displayRhombus);
		
		double sideLength=Console.getSide();
		double anglePair_1=Console.getAnglePair("first");
		
		Rhombus rhombus=new Rhombus (sideLength, anglePair_1);
		
		rhombus.setName(rhombName);
		
		return rhombus;
		
	}
	
	public static Square buildSquare() {
		
		
		 
		/*  
		 *                length
		 *           _________________
		 *          /                 /
		 *    width/                 /
		 *        /                 /
		 *       /                 /
		 *      /_________________/
		 * angle_pair_1    
		 *         
		 *       
		 */
		String sqreName =Console.getString("Please Enter the Name you wish to Use: ");
		
		System.out.println("Enter the values listed below: \n");
		
		String displaySquare = ShapeStrings.displaySquare();
		
		System.out.println(displaySquare);
		
		double sideLength=Console.getSide();
		
		Square square=new Square (sideLength);
		
		square.setName(sqreName);
		
		return square;
		
	}
	
	public static Regular_Polygon buildRegularPolygon() {
		
		
		
		/*          
		 *               
		 *       /          
		 *      /           
		 *     |
		 * side|      X  numSides
		 *     |
		 *      \
		 *       \
		 *           
		 *         
		 *       
		 */
		String regulPolyName =Console.getString("Please Enter the Name you wish to Use: ");
		
		System.out.println("Enter the values listed below: \n");
		
		String displayRegularPolygon = ShapeStrings.displayRegularPolygon();
		
		System.out.println(displayRegularPolygon);
		
		int numSides=Console.getNumSides();
		double sideLength=Console.getSide();
		
		
		Regular_Polygon regularPolygon=new Regular_Polygon (numSides,sideLength);
		
		regularPolygon.setName(regulPolyName);
		
		return regularPolygon;
		
	}
	
	public static Circle buildCircle() {
		
		
		 
		/*  
		 *        
	 *           # # #
	 *       # #       # #
	 *       #           # 
	 *     #               #
	 *     #       ________#
	 *     #       radius  #
	 *       #           #
	 *       # #       # #
	 *           # # #
	 *      
	 *        
		 *       
		 */
		String circName =Console.getString("Please Enter the Name you wish to Use: ");
		
		System.out.println("Enter the values listed below: \n");
		
		String displayCircle = ShapeStrings.displayCircle();
		
		System.out.println(displayCircle);
		
		double radius=Console.getRadius();
		
		Circle circle=new Circle (radius);
		
		circle.setName(circName);
		
		return circle;
		
	}

	public static Ellipses buildEllipses() {
	
		
		 
		/*  
		 *      
		 *             # # # #
		 *         # #    |    # #
		 *       #   semi-|        # 
		 *     #  Minor-Axis         #
		 *     #          |__________#
		 *     #           semi-     #
		 *       #      Major-Axis #
		 *         # #         # #
		 *             # # # #
		 *      
		 *           
		 *       
		 */
		String elliName =Console.getString("Please Enter the Name you wish to Use: ");
		
		System.out.println("Enter the values listed below: \n");
		
		String displayEllipses = ShapeStrings.displayEllipses();
		
		System.out.println(displayEllipses);
		
		double semiMinorAxis=Console.getSemiAxis( "Minor");
		double semiMajorAxis=Console.getSemiAxis(" Major");
		
		Ellipses ellipses=new Ellipses (semiMinorAxis, semiMajorAxis);
		
		ellipses.setName(elliName);
		
		return ellipses;
	
	}
	

}
