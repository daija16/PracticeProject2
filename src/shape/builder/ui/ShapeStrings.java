package shape.builder.ui;


public class ShapeStrings {

	
	public static String displayTriangle() {
		StringBuilder displayTriangle = new StringBuilder();
		 
		
		displayTriangle.append("\n");
		displayTriangle.append("              angle_B\n");
		displayTriangle.append("                /|\\\n");
		displayTriangle.append("               / | \\\n");
		displayTriangle.append("              /  |  \\\n");
		displayTriangle.append("             /   |   \\\n");		
		displayTriangle.append("      side_C/    |    \\side_A\n");
		displayTriangle.append("           /     |\\    \\\n");
		displayTriangle.append("          /      |height\\\n");
		displayTriangle.append("         /       |       \\\n");
		displayTriangle.append("        /________|________\\\n");
		displayTriangle.append("   angle_A    side_B   angle_C\n");
		displayTriangle.append("              (base)\n");
		displayTriangle.append("\n");
		
		return displayTriangle.toString();
		
		
	}
		
	public static String displayTrapezoid() {
		StringBuilder displayTrapezoid = new StringBuilder();
		 
		
	
		displayTrapezoid.append("\n");
		displayTrapezoid.append("              base_1\n");
		displayTrapezoid.append("            ____________\n");
		displayTrapezoid.append("           /     |      \\\n");		
		displayTrapezoid.append("     leg_1/      |       \\leg_2\n");
		displayTrapezoid.append("         /       |\\       \\\n");
		displayTrapezoid.append("        /        |height   \\\n");
		displayTrapezoid.append("       /_________|__________\\\n");
		displayTrapezoid.append("               base_2\n");
		displayTrapezoid.append("\n");
		
		
		return displayTrapezoid.toString();
	}
		
	public static String displayKite(){
		StringBuilder displayKite = new StringBuilder();
		 
		
		
		displayKite.append("\n");
		displayKite.append("            angle\n");
		displayKite.append("             /\\\n");
		displayKite.append("            /  \\\n");		
		displayKite.append(" left_side /    \\right_side\n");
		displayKite.append("          /      \\\n");
		displayKite.append("         /        \\\n");
		displayKite.append("         \\        /\n");
		displayKite.append("          \\      /\n");
		displayKite.append("           \\    /\n");
		displayKite.append("            \\  /\n");		
		displayKite.append("             \\/\n");
		displayKite.append("\n");
		
		
		return displayKite.toString();
		
	}
		
	public static String displayParallelogram(){
		StringBuilder displayParallelogram = new StringBuilder();
		 
		
		
		displayParallelogram.append("\n");
		displayParallelogram.append("                length\n");
		displayParallelogram.append("           _________________\n");
		displayParallelogram.append("          /   |             /\n");		
		displayParallelogram.append("    width/    |            /\n");
		displayParallelogram.append("        /     |\\          /\n");
		displayParallelogram.append("       /      |height    /\n");
		displayParallelogram.append("      /_______|_________/\n");
		displayParallelogram.append(" angle_pair_1\n");
		displayParallelogram.append("\n");
		
		
		return displayParallelogram.toString();
	}
		
	public static String displayRectangle(){
		StringBuilder displayRectangle = new StringBuilder();
		 
		
		
		displayRectangle.append("\n");
		displayRectangle.append("           length\n");
		displayRectangle.append("       _________________\n");
		displayRectangle.append("      |                 |\n");		
		displayRectangle.append("      |                 |\n");
		displayRectangle.append(" width|                 |\n");
		displayRectangle.append("      |                 |\n");
		displayRectangle.append("      |_________________|\n");
		displayRectangle.append("\n");
		
		
		return displayRectangle.toString();
	}
		
	public static String displayRhombus(){
		StringBuilder displayRhombus = new StringBuilder();
		 
		
		
		displayRhombus.append("\n");
		displayRhombus.append("           ___________\n");
		displayRhombus.append("          /|          /\n");		
		displayRhombus.append("     side/ |         /\n");
		displayRhombus.append("        /  |\\       /\n");
		displayRhombus.append("       /   |height /\n");
		displayRhombus.append("      /____|______/\n");
		displayRhombus.append(" angle_pair_1\n");
		displayRhombus.append("\n");
		
		
		return displayRhombus.toString();
	}
		
	public static String displaySquare(){
		StringBuilder displaySquare = new StringBuilder();
		 
		
		
		displaySquare.append("\n");
		displaySquare.append("       __________\n");
		displaySquare.append("      |          |\n");		
		displaySquare.append("      |          |\n");
		displaySquare.append("  side|          |\n");
		displaySquare.append("      |          |\n");
		displaySquare.append("      |__________|\n");
		displaySquare.append("\n");
		
		
		return displaySquare.toString();
		
	}
	
	public static String displayRegularPolygon(){
		StringBuilder displayRegularPolygon = new StringBuilder();
		
		
		
		displayRegularPolygon.append("\n");
		displayRegularPolygon.append("        /\n");		
		displayRegularPolygon.append("       /\n");
		displayRegularPolygon.append("      |\n");
		displayRegularPolygon.append("  side|      X  numSides\n");
		displayRegularPolygon.append("      |\n");
		displayRegularPolygon.append("       \\\n");
		displayRegularPolygon.append("        \\\n");		
		displayRegularPolygon.append("\n");
		
		
		return displayRegularPolygon.toString();
	}
	
	public static String displayCircle(){
		StringBuilder displayCircle = new StringBuilder();
		 
		
		
		displayCircle.append("\n");
		displayCircle.append("           # # #\n");
		displayCircle.append("       # #       # #\n");
		displayCircle.append("       #           #\n");		
		displayCircle.append("     #               #\n");
		displayCircle.append("     #       ________#\n");
		displayCircle.append("     #       radius  #\n");
		displayCircle.append("       #           #\n");
		displayCircle.append("       # #       # #\n");
		displayCircle.append("           # # #\n");
		displayCircle.append("\n");
		
		return displayCircle.toString();
	}
	
	public static String displayEllipses(){
		StringBuilder displayEllipses = new StringBuilder();
		 
		
		
		displayEllipses.append("\n");
		displayEllipses.append("             # # # #\n");
		displayEllipses.append("         # #    |    # #\n");		
		displayEllipses.append("       #   semi-|        #\n");
		displayEllipses.append("     #  Minor-Axis         #\n");
		displayEllipses.append("     #          |__________#\n");
		displayEllipses.append("     #           semi-     #\n");
		displayEllipses.append("       #      Major-Axis #\n");
		displayEllipses.append("         # #         # #\n");
		displayEllipses.append("             # # # #\n");
		displayEllipses.append("\n");
		
		
		return displayEllipses.toString();
	}
	
	
}
