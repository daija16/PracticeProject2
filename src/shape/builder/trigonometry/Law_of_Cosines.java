package shape.builder.trigonometry;
/*
 * The Law of Cosines
 * c^2 = a^2 + b^2 − 2ab(cos(C))
 */

/*    
 *          B
 *         /\
 *        /  \
 *      c/    \a
 *      /      \
 *     /________\
 *    A     b    C
 */
public interface Law_of_Cosines {
	//radians = degrees × π / 180°
	//degrees = radians × 180° / π	
	//toRadians()
	//toDegrees()
	
	default double locAngle(double side_c, double side_a, double side_b) {
		/*
		 * c^2 = a^2 + b^2 − 2ab(cos(C))
		 * c^2 + 2ab(cos(C)) = a^2 + b^2 − 2ab(cos(C)) + 2ab(cos(C))
		 * c^2 + 2ab(cos(C)) = a^2 + b^2 
		 * c^2 + 2ab(cos(C)) - c^2 = a^2 + b^2 - c^2
		 * 2ab(cos(C)) = a^2 + b^2 - c^2
		 * (2ab(cos(C)))/2ab = (a^2 + b^2 - c^2)/2ab
		 * cos(C) = (a^2 + b^2 - c^2)/2ab
		 * cos^-1(cos(C)) = cos^-1((a^2 + b^2 - c^2)/2ab)  
		 * C = cos^-1((a^2 + b^2 - c^2)/2ab)  
		 * 
		 * C = cos^-1((a^2 + b^2 - c^2)/2ab)  
		 * 
		 */
		//Math.pow(,2)
		
		
		double locAngle=Math.toDegrees(Math.acos((Math.pow(side_a,2)+Math.pow(side_b,2)-Math.pow(side_c,2))/(2*side_a*side_b)));
	
		return locAngle;
	
	}
	
	default double locSide(double angle_c, double side_a, double side_b) {
		/*
		 * c^2 = a^2 + b^2 − 2ab(cos(C))
		 * √(c^2) = √(a^2 + b^2 − 2ab(cos(C)))
		 * c = √(a^2 + b^2 − 2ab(cos(C)))
		 */
		
		
		double locSide=Math.sqrt(Math.pow(side_a,2)+Math.pow(side_b,2)-(2*side_a*side_b*Math.cos(Math.toRadians(angle_c))));
		
		return locSide;
	}
	
	
	
}
