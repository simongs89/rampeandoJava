package com.globallogic.items;

import java.util.ArrayList;

public class Turtle {
	
	private ArrayList<Point> points = new ArrayList<>();
	private int directionAngle = 0;;
	
	public Turtle(Point point) {
		super();
		points.add(point);
	}
	
	public ArrayList<Point> giveMeYourPath(){
		return this.points;
	}
	
	public void rotate(int degrees){
		directionAngle += degrees;
	}
	
	//TODO cambiar a usar Segment
	public void go(int steps){
		Point lastPoint = points.get(points.size()-1);
		Point nextPoint = new Point(lastPoint.getX(), lastPoint.getY());
		Point versorPoint = new Point(Math.sin(Math.toRadians(directionAngle)), 
				Math.cos(Math.toRadians(directionAngle)));
		versorPoint.multiply(steps);
		nextPoint.add(versorPoint);
		points.add(nextPoint);
	}
	
	public void showStringPath(){
		System.out.println("************* ALL POINTS WALKED WITHOUT TOUCH **************");
		for (Point point : points) {
			System.out.println(point.toString());
		}
		System.out.println("**********************************************");
	}

}
