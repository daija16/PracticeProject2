package shape.builder.graphics;

public class Points {

	
	private double x;
	private double y;
	String i;
		
	public Points () {}
	
	public Points (double x,double y) {
		this.x= x;
		this.y= y;
	}
	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}



	public static double getTopX(double distance,double left,double right){
		
		
		double x = (Math.pow(distance,2)+Math.pow(left,2)-Math.pow(right,2))/(2*distance);
		
		return x;
	}
	public static double getTopY(double distance,double left,double right){
		 
		
		double y =Math.sqrt(Math.pow(left,2)-Math.pow(((Math.pow(distance,2)+Math.pow(left,2)-Math.pow(right,2))/(2*distance)),2));
	    
		return y;
	
	}
	
	@Override
	public String toString() {
		String pointStr="("+this.x+","+this.y+")";
		return pointStr;
	}
}
