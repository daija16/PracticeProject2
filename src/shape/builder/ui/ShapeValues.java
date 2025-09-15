package shape.builder.ui;

public class ShapeValues {
	
	
	public static double[] triangleAreaValues() {
		
		double[] values =new double[2];
			
		values[0]=Console.getBase();
		values[1]=Console.getHeight();
		
		
		return values;
	}
	public static double[] trianglePerimeterValues() {
		
		double[] values =new double[3];
		
		values[0]=Console.getSide("A");
		values[1]=Console.getSide("B");
		values[2]=Console.getSide("C");
		
		
		return values;
	}
	public static double[] trapezoidAreaValues() {
		
		double[] values=new double[3];
		
		values[0]=Console.getBase(1);
		values[1]=Console.getBase(2);
		values[2]=Console.getHeight();
		
		
		return values;
	}
	public static double[] trapezoidPerimeterValues() {
		
		double[] values=new double[4];
		
		values[0]=Console.getLeg(1);
		values[1]=Console.getBase(1);
		values[2]=Console.getLeg(2);
		values[3]=Console.getBase(2);
		
		
		return values;
	}
	public static double[] kiteAreaValues() {
		
		double[] values=new double[3];
		
		values[0]=Console.getSidePair("Left");
		values[1]=Console.getSidePair("Right");
		values[2]=Console.getAngle();
		
		
		return values;
	}
	public static double[] kitePerimeterValues() {
		
		double[] values=new double[2];
		
		values[0]=Console.getSidePair("Left");
		values[1]=Console.getSidePair("Right");
		
		
		return values;
	}
	public static double[] parallelogramAreaValues() {
		
		double[] values =new double[2];
		
		values[0]=Console.getBase();
		values[1]=Console.getHeight();
			
		
		return values;
	}
	public static double[] parallelogramPerimeterValues() {
		
		double[] values=new double[2];
		
		values[0]=Console.getLength();
		values[1]=Console.getWidth();
		
		
		return values;
	}
	public static double[] rectangleValues () {
		
		double[] values =new double[2];
		
		values[0]=Console.getLength();
		values[1]=Console.getWidth();
		
		
		return values;
	}
	public static double[] rhombusAreaValues() {
		
		double[] values=new double[2];
		
		values[0]=Console.getSide();
		values[1]=Console.getAnglePair("first");
		
		
		return values;
	}
	public static double[] rhombusPerimeterValues() {
		
		double[] values=new double[1];
		
		values[0]=Console.getSide();
		
		
		return values;
	}
	public static double[] squareValues() {
		
		double[] values =new double[1];
		
		values[0]=Console.getSide();
		
		return values;
	}
	public static double[] regularPolygonValues() {
		
		double[] values =new double[2];
		
		values[0]=Console.getNumSides();
		values[1]=Console.getSide();
		
		return values;
	}
	public static double[] circleValues() {
		
		double[] values =new double[1];
		
		values[0]=Console.getRadius();
		
		return values;
	}
	public static double[] ellipseValues() {
		
		double[] values = new double[2];
		
		values[0]=Console.getSemiAxis( "Minor");
		values[1]=Console.getSemiAxis(" Major");
		
		return values;
	}
}