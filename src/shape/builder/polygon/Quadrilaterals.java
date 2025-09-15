package shape.builder.polygon;

import shape.builder.subtypes.PolygonSubtypes;
import shape.builder.subtypes.QuadrilateralSubtypes;

abstract class Quadrilaterals extends Polygons{
	
	public PolygonSubtypes polyType=PolygonSubtypes.Quadrilateral;
	public QuadrilateralSubtypes quadType;
	
	protected int numSides=4;
}
