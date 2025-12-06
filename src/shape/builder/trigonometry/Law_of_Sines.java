package shape.builder.trigonometry;
/* 
 * The Law of Sines
 * a/sin(A)  =  b/sin(B)  =  c/sin(C)
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
public interface Law_of_Sines {
	//radians = degrees × π / 180°
	//degrees = radians × 180° / π		
	// side_1 angle_2;
	default double losAngle(double side_c, double side_b, double angle_b) {
		/*
		 *  b/sin(B)  =  c/sin(C)
		 *  sin(B)/b  =  sin(C)/c
		 *  (sin(B)/b)c  =  (sin(C)/c)c
		 *  (sin(B)/b)c  =  sin(C)
		 *  sin^-1((sin(B)/b)c)  =  sin^-1(sin(C))
		 *  sin^-1((sin(B)/b)c)  =  C
		 *  
		 *  C = sin^-1(sin(B)/bc)
		 */
		//sdfghnjmkl.;/'
		
		
		double losAngle=Math.toDegrees(Math.asin(Math.sin(Math.toRadians(angle_b))/side_c*side_b));
		
		return losAngle;
	}
	
	
	
	default double losSide(double angle_c, double side_b, double angle_b) {
		/*
		 *   b/sin(B)  =  c/sin(C)
		 *   (b/sin(B))sin(C)  =  (c/sin(C))sin(C)
		 *   (b/sin(B))sin(C)  =  (c/sin(C))sin(C)
		 *   (b/sin(B))sin(C)  =  c
		 *   
		 *   c = b/sin(B)sin(C);
		 */
		
		
		
		double losSide=side_b/Math.sin(Math.toRadians(angle_b))*Math.sin(Math.toRadians(angle_c));
		return losSide;
	}
	
	
}
