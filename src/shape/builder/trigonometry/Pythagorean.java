package shape.builder.trigonometry;
/*
 * Pythagorean Theorem
 * 	a2 + b2 = c2
 */

/*    
 *         |\
 *         | \
 *        b|  \c
 *         |   \
 *         |____\
 *            a  
 */
public interface Pythagorean {
	default double pythagoreanSide(double side_a, double hypotenuse) {
		/*
		 *  	a%2 + b^2 = c^2
		 *      a^2 -a^2 + b^2 = c^2 -a^2
		 *      b^2 = c^2 -a^2
		 *      √(b^2) = √(c^2 -a^2)
		 *      b = √(c^2 -a^2)
		 *      
		 *      b = √(c^2 -a^2) 
		 */
		 double pythagoreanSide=Math.sqrt(Math.pow(hypotenuse, 2)-Math.pow(side_a, 2));
		
		 return pythagoreanSide;
	}
	
	default double Hypotenuse(double side_a, double side_b) {
		/*
		 *  	a^2 + b^2 = c^2
		 *      √(a^2 + b^2) = √(c^2)
		 *      √(a^2 + b^2) = c
		 *      
		 *      c = √(a^2 + b^2)
		 */
		double hypotenuse=Math.sqrt(Math.pow(side_a, 2)+Math.pow(side_b, 2));
		
		return hypotenuse;
	}
}
