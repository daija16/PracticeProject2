package shape.builder.polygon;

import shape.builder.subtypes.PolygonSubtypes;

public abstract class Polygons {
    
	public PolygonSubtypes polyType;
	
	protected int numSides;
	protected String name;
	protected boolean isRegular;
	
	
	public boolean isRegular() {
		return this.isRegular;
	}
	public void setRegular(boolean isRegular) {
		this.isRegular = isRegular;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumSides() {
		return this.numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}




}
