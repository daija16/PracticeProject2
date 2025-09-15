package shape.builder.ui;

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

public class ShapeBuilderManagerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Product Manager\n");
        displayMenu();

        String action = "";
        while (!action.equalsIgnoreCase("exit")) {
           
            action = Console.getString("Enter a command: ");
            System.out.println();

            if (action.equalsIgnoreCase("area")) {
            	areaOfShape();
            } else if (action.equalsIgnoreCase("perimeter")) {
            	perimeterOfShape();
            } else if (action.equalsIgnoreCase("build")) {
            	buildShape();
            } else if (action.equalsIgnoreCase("help") || 
                       action.equalsIgnoreCase("menu")) {
                displayMenu();
            } else if (action.equalsIgnoreCase("exit")) {
                System.out.println("Bye.\n");
            } else {
                System.out.println("Error! Not a valid command.\n");
            }
        }
    }

	
    public static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("area    - Get area of a shape");
        System.out.println("perimeter     - Get perimeter of a shape");
        System.out.println("build     - Build and display a shape");
        System.out.println("help    - Show this menu");
        System.out.println("exit    - Exit this application\n");
    }

	public static void areaOfShape() { 
		
		
		double[] values;
		
		String shapeStr=Console.getLine("Pick the type of Shape you wish to Use: \nPolygon      Round\n");
		if(shapeStr.equalsIgnoreCase("polygon")) {
			String polyStr=Console.getLine("Pick the type of Polygon you wish to Use: \nTriangle      Quadrilaterals      Regular Polygon\n");
			if(polyStr.equalsIgnoreCase("triangle")) {
				System.out.println("Please Enter the Values asked for below: \n");
				ShapeStrings.displayTriangle();
				values=ShapeValues.triangleAreaValues(); 
				ShapeFormulas.areaResults(values, Triangle.areaFormula);
			} else if(polyStr.equalsIgnoreCase("quadrilaterals")) {
				String quadStr=Console.getLine("Pick the type of Quadrilateral you wish to Use: \nTrapezoid      Kite      Parallelogram      Rhombus      Rectangle      Square\n");
				switch(quadStr) {
				
					case "trapezoid":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayTrapezoid();
						values=ShapeValues.trapezoidAreaValues(); 
						ShapeFormulas.areaResults(values, Trapezoid.areaFormula);
						break;	
					case "kite":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayKite();
						values=ShapeValues.kiteAreaValues(); 
						ShapeFormulas.areaResults(values, Kite.areaFormula);
						break;	
					case "parallelogram":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayParallelogram();
						values=ShapeValues.parallelogramAreaValues(); 
						ShapeFormulas.areaResults(values, Parallelogram.areaFormula);
						break;
					case "rectangle":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayRectangle();
						values=ShapeValues.rectangleValues(); 
						ShapeFormulas.areaResults(values, Parallelogram.areaFormula);
						break;	
					case "rhombus":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayRhombus();
						values=ShapeValues.rhombusAreaValues(); 
						ShapeFormulas.areaResults(values, Rhombus.areaFormula);
						break;	
					case "square":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displaySquare();
						values=ShapeValues.squareValues(); 
						ShapeFormulas.areaResults(values, Square.areaFormula);
						break;	
						
			 }
			} else if(polyStr.equalsIgnoreCase("regular polygon")) {
				System.out.println("Please Enter the Values asked for below: \n");
				ShapeStrings.displayRegularPolygon();
				values=ShapeValues.regularPolygonValues(); 
				ShapeFormulas.areaResults(values, Regular_Polygon.areaFormula);
			}
		} else if(shapeStr.equalsIgnoreCase("round")) {
			String roundStr=Console.getLine("Pick the type of Round Shape you wish to Use: \nCircle      Ellipse\n");
			if(roundStr.equalsIgnoreCase("circle")) {
				System.out.println("Please Enter the Values asked for below: \n");
				ShapeStrings.displayCircle();
				values=ShapeValues.circleValues(); 
				ShapeFormulas.areaResults(values, Circle.areaFormula);
			} else if(roundStr.equalsIgnoreCase("ellipse")) {
				System.out.println("Please Enter the Values asked for below: \n");
				ShapeStrings.displayEllipses();
				values=ShapeValues.ellipseValues(); 
				ShapeFormulas.areaResults(values, Ellipses.areaFormula);
			}
		
		}
		
	
	}	
	
	public static void perimeterOfShape() { 
		
		
		double[] values;
		
		String shapeStr=Console.getLine("Pick the type of Shape you wish to Use: \nPolygon      Round\n");
		if(shapeStr.equalsIgnoreCase("polygon")) {
			String polyStr=Console.getLine("Pick the type of Polygon you wish to Use: \nTriangle      Quadrilaterals      Regular Polygon\n");
			if(polyStr.equalsIgnoreCase("triangle")) {
				System.out.println("Please Enter the Values asked for below: \n");
				ShapeStrings.displayTriangle();
				values=ShapeValues.trianglePerimeterValues(); 
				ShapeFormulas.perimeterResults(values, Triangle.perimeterFormula);
			} else if(polyStr.equalsIgnoreCase("quadrilaterals")) {
				String quadStr=Console.getLine("Pick the type of Quadrilateral you wish to Use: \nTrapezoid      Kite      Parallelogram      Rhombus      Rectangle      Square\n");
				switch(quadStr) {
				
					case "trapezoid":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayTrapezoid();
						values=ShapeValues.trapezoidPerimeterValues(); 
						ShapeFormulas.perimeterResults(values, Trapezoid.perimeterFormula);
						break;	
					case "kite":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayKite();
						values=ShapeValues.kitePerimeterValues(); 
						ShapeFormulas.perimeterResults(values, Kite.perimeterFormula);
						break;	
					case "parallelogram":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayParallelogram();
						values=ShapeValues.parallelogramPerimeterValues(); 
						ShapeFormulas.perimeterResults(values, Parallelogram.perimeterFormula);
						break;
					case "rectangle":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayRectangle();
						values=ShapeValues.rectangleValues(); 
						ShapeFormulas.perimeterResults(values, Parallelogram.perimeterFormula);
						break;	
					case "rhombus":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displayRhombus();
						values=ShapeValues.rhombusPerimeterValues(); 
						ShapeFormulas.perimeterResults(values, Rhombus.perimeterFormula);
						break;	
					case "square":
						System.out.println("Please Enter the Values asked for below: \n");
						ShapeStrings.displaySquare();
						values=ShapeValues.squareValues(); 
						ShapeFormulas.perimeterResults(values, Rhombus.perimeterFormula);
						break;	
						
			 }
			} else if(polyStr.equalsIgnoreCase("regular polygon")) {
				values=ShapeValues.regularPolygonValues(); 
				ShapeFormulas.perimeterResults(values, Regular_Polygon.perimeterFormula);
			}
		} else if(shapeStr.equalsIgnoreCase("round")) {
			String roundStr=Console.getLine("Pick the type of Round Shape you wish to Use: \nCircle      Ellipse\n");
			if(roundStr.equalsIgnoreCase("circle")) {
				System.out.println("Please Enter the Values asked for below: \n");
				ShapeStrings.displayCircle();
				values=ShapeValues.circleValues(); 
				double circumference=Circle.circumference(values);
				System.out.println("The Circumference is: "+circumference);
			} else if(roundStr.equalsIgnoreCase("ellipse")) {
				System.out.println("Please Enter the Values asked for below: \n");
				ShapeStrings.displayEllipses();
				values=ShapeValues.ellipseValues(); 
				double perimeterApproximation=Ellipses.perimeterApproximation(values);
				System.out.println("The Perimeter Approximation is: "+perimeterApproximation);
			}
		
		}
		
		
	}
	
	public static void buildShape() { 
		
		
		//double[] values;
		
		String shapeStr=Console.getLine("Pick the type of Shape you wish to Make: \nPolygon      Round\n");
		if(shapeStr.equalsIgnoreCase("polygon")) {
			String polyStr=Console.getLine("Pick the type of Polygon you wish to Make: \nTriangle      Quadrilaterals      Regular Polygon\n");
			if(polyStr.equalsIgnoreCase("triangle")) {
				Triangle triangle=ShapeBuilds.buildTriangle();
				System.out.println(triangle.toString());
			} else if(polyStr.equalsIgnoreCase("quadrilaterals")) {
				String quadStr=Console.getLine("Pick the type of Quadrilateral you wish to Make: \nTrapezoid      Kite      Parallelogram      Rhombus      Rectangle      Square\n");
				switch(quadStr) {
				
					case "trapezoid":
						Trapezoid trapezoid=ShapeBuilds.buildTrapezoid();
						System.out.println(trapezoid.toString());
						break;	
					case "kite":
						Kite kite=ShapeBuilds.buildKite();
						System.out.println(kite.toString());
						break;	
					case "parallelogram":
						Parallelogram parallelogram=ShapeBuilds.buildParallelogram();
						System.out.println(parallelogram.toString());
						break;
					case "rectangle":
						Rectangle rectangle=ShapeBuilds.buildRectangle();
						System.out.println(rectangle.toString());
						break;	
					case "rhombus":
						Rhombus rhombus=ShapeBuilds.buildRhombus();
						System.out.println(rhombus.toString());
						break;	
					case "square":
						Square square=ShapeBuilds.buildSquare();
						System.out.println(square.toString());
						break;	
						
			 }
			} else if(polyStr.equalsIgnoreCase("regular polygon")) {
				Regular_Polygon regularPolygon=ShapeBuilds.buildRegularPolygon();
				System.out.println(regularPolygon.toString());
			}
		} else if(shapeStr.equalsIgnoreCase("round")) {
			String roundStr=Console.getLine("Pick the type of Round Shape you wish to Make: \nCircle      Ellipse\n");
			if(roundStr.equalsIgnoreCase("circle")) {
				Circle circle=ShapeBuilds.buildCircle();
				System.out.println(circle.toString());
			} else if(roundStr.equalsIgnoreCase("ellipse")) {
				Ellipses ellipse=ShapeBuilds.buildEllipses();
				System.out.println(ellipse.toString());
			}
		
		}
		
		
	}
	
	
}

