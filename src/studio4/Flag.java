package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(512,300);
		StdDraw.setPenColor(46,139, 87);
		StdDraw.filledRectangle(0.167, 0.5, 0.167, 0.5);	
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.5, 0.5, 0.167, 0.5);	
		StdDraw.setPenColor(46,139, 87);
		StdDraw.filledRectangle(0.833, 0.5, 0.167, 0.5);	
	}
}