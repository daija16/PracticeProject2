package shape.builder.ui;

import shape.builder.attributes.Area;
import shape.builder.attributes.Perimeter;

public class ShapeFormulas {
	public static void areaResults(double[] values, Area formula) {
		
		double result = formula.area(values);
	    
		System.out.println("The Area is: "+result);
	   		
	}
	public static void perimeterResults(double[] values, Perimeter formula) {
		
		double result = formula.perimeter(values);
	    
		System.out.println("The Perimeter is: "+result);
		
	}
	
	
	
	
}
