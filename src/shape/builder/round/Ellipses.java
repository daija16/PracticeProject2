package shape.builder.round;


import shape.builder.attributes.Area;
import shape.builder.subtypes.RoundSubtypes;


public class Ellipses extends Round_Shapes {
	
	public RoundSubtypes roundType=RoundSubtypes.Ellipse;
	
	
	private double semiMinorAxis;
	private double semiMajorAxis;
	private double minorAxis;
	private double majorAxis;
	
	public static Area areaFormula= (values) -> Math.PI*values[0]*values[1];
	
	public Ellipses (double semiMinorAxis, double semiMajorAxis) {
		
		this.semiMajorAxis=semiMajorAxis;
		this.semiMinorAxis=semiMinorAxis;
		this.majorAxis=semiMajorAxis*2;
		this.minorAxis=semiMinorAxis*2;
	}
	
	/**
	 * @return the minorAxis
	 */
	public double getMinorAxis() {
		return this.minorAxis;
	}
	
	/**
	 * @param minorAxis the minorAxis to set
	 */
	public void setMinorAxis(double minorAxis) {
		this.minorAxis = minorAxis;
	}
	
	/**
	 * @return the majorAxis
	 */
	public double getMajorAxis() {
		return this.majorAxis;
	}
	
	/**
	 * @param majorAxis the majorAxis to set
	 */
	public void setMajorAxis(double majorAxis) {
		this.majorAxis = majorAxis;
	}
	
	/**
	 * @return the semiMinorAxis
	 */
	public double getSemiMinorAxis() {
		return this.semiMinorAxis;
	}
	
	/**
	 * @param semiMinorAxis the semiMinorAxis to set
	 */
	public void setSemiMinorAxis(double semiMinorAxis) {
		this.semiMinorAxis = semiMinorAxis;
	}
	
	/**
	 * @return the semiMajorAxis
	 */
	public double getSemiMajorAxis() {
		return this.semiMajorAxis;
	}
	
	/**
	 * @param semiMajorAxis the semiMajorAxis to set
	 */
	public void setSemiMajorAxis(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}
	
	@Override
	public String toString() {
		
		StringBuilder elliStr=new StringBuilder();
		
		
		elliStr.append("Semi-Minor-Axis: ");
		elliStr.append(this.semiMinorAxis);
		elliStr.append("\n");
		elliStr.append("Semi-Major-Axis: ");
		elliStr.append(this.semiMinorAxis);
		elliStr.append("\n");
		elliStr.append("Minor Axis: ");
		elliStr.append(this.minorAxis);
		elliStr.append("\n");
		elliStr.append("Major Axis: ");
		elliStr.append(this.majorAxis);
		elliStr.append("\n");
	
		
		return elliStr.toString();
	}
	
	
	public static double perimeterApproximation(double[] values) {
		double perimeterApproximation = 0;
		if(values[1]<(values[0]*3)) {
		/*
		 * 	p ≈ 2π √(a2+b2/2)
		 * 
		 * Math.PI
		 * Math.pow(,2)
		 * Math.sqrt()
		 * 
		 * 2*Math.PI*Math.sqrt((Math.pow(,2)+Math.pow(,2))/2);
		 */
			perimeterApproximation =2*Math.PI*Math.sqrt((Math.pow(values[0],2)+Math.pow(values[1],2))/2);
		} else {
			/*
			 * p ≈ π ( 3(a+b) − √(3a+b)(a+3b) )
			 * 
			 */
			
			perimeterApproximation =Math.PI*((3*(values[1]+values[0]))- Math.sqrt(((3*values[1])+values[0])*(values[1]+(3*values[0]))));
		}
		
		return perimeterApproximation;
	}
	
	
	
}
