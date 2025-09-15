package shape.builder.round;

import shape.builder.subtypes.RoundSubtypes;

public class Round_Shapes {
	public RoundSubtypes roundType;
	protected String name;
	protected double eccentricity;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
