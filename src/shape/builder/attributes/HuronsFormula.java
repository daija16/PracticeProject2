package shape.builder.attributes;
/*
 * HuronsFormula
 *
 * s =(a+b+c)/2;
 * A = √s(s−a)(s−b)(s−c);
 *  bh/2;
 *  
 */
public interface HuronsFormula {

	default double getHuronSide(double side_a, double side_b, double side_c) {
		
		double s = (side_a+side_b+side_c)/2;
		
		double area=Math.sqrt(s*(s-side_a)*(s-side_b)*(s-side_c));	
				
		double huronSide=(area*2)/side_c;
		
		return huronSide;
	}

}
