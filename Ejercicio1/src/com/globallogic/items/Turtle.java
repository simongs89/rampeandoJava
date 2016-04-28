package com.globallogic.items;

import java.util.ArrayList;

public class Turtle {
	
	private ArrayList<Point> points = new ArrayList<>();
	
	public Turtle(Point point) {
		super();
		points.add(point);
	}
	
	public ArrayList<Point> giveMeYourPath(){
		return this.points;
	}
	
	public void go(int steps, Direction direction){
		
		Point lastPoint = points.get(points.size()-1);
		
		if(direction == Direction.NORTH){
			points.add(new Point(lastPoint.getX(), lastPoint.getY()+steps));
		}
		if(direction == Direction.EAST){
			points.add(new Point(lastPoint.getX()+steps, lastPoint.getY()));
		}
		if(direction == Direction.SOUTH){
			points.add(new Point(lastPoint.getX(), lastPoint.getY()-steps));
		}
		if(direction == Direction.WEST){
			points.add(new Point(lastPoint.getX()-steps, lastPoint.getY()));
		}
	}
	
	public void showYourPath(){
		System.out.println("************* ALL POINTS WALKED **************");
		for (Point point : points) {
			System.out.println(point.getPosition());
		}
		System.out.println("**********************************************");
	}

}
