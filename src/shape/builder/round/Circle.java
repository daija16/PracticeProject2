package shape.builder.round;


import shape.builder.attributes.Area;
import shape.builder.subtypes.RoundSubtypes;


public class Circle extends Round_Shapes {
	
	public RoundSubtypes roundType=RoundSubtypes.Circle;
	
	protected double eccentricity=0;

	private double radius;
	private double diameter;
	
	public static Area areaFormula=(values) -> Math.PI*Math.pow(values[0], 2);  //π r2;

	public Circle (double radius) {
		
		this.radius=radius;
		this.diameter=radius*2;
	}

	/**
	 * @return the diameter
	 */
	public double getDiameter() {
		return this.diameter;
	}
	
	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		
		StringBuilder circStr=new StringBuilder();
		
		
		circStr.append("Radius: ");
		circStr.append(this.radius);
		circStr.append("\n");
		circStr.append("Diameter: ");
		circStr.append(this.diameter);
		circStr.append("\n");
	
		
		return circStr.toString();
	}
	
	public static double circumference(double[] values) {
		
		double circumference =2*Math.PI*values[0];
		
		return circumference;
	}
	
}
