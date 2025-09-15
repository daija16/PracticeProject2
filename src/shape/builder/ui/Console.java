package shape.builder.ui;

import java.util.Scanner;

public class Console {
	private static Scanner sc = new Scanner(System.in);
	
	public static String getLine(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();        // read the whole line
        return s;
    }
	
	public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();        // read the first string on the line
        sc.nextLine();               // discard the rest of the line
        return s;
    }
	
	public static int getNumSides() {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Number Of Sides: ");
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    
	}
	
	public static double getBase() {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Base: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getBase(int num) {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Base_"+num+": ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getLeg(int num) {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Leg_"+num+": ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getHeight() {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Height: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getSide(String num) {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Side_"+num+": ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getSide() {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Side: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getSidePair(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of "+prompt+" Pair Of Sides: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getLength() {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Length: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getWidth() {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Width: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getAngle() {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Angle: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getAnglePair(String num) {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
        	System.out.print("Enter Value Of "+num+" Pair Of Angle: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getAngle(String num) {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Angle_"+num+": ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getRadius() {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of Radius: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
	
	public static double getSemiAxis(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print("Enter Value Of semi"+prompt+"-Axis: ");
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }
}
