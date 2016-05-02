package com.globallogic.items;

import java.util.ArrayList;

public class Turtle {

	private ArrayList<Segment> path = new ArrayList<>();
	private Point position;
	private double radians = 0;

	public Turtle(final Point position) {
		this.position = position;
	}

	public ArrayList<Segment> giveMeYourPath() {
		return this.path;
	}

	public void rotate(double radians) {
		this.radians += radians;
		if(this.radians >= Math.PI * 2){
			this.radians -= Math.PI * 2;
		}
	}

	public void go(int steps) {
		Point versorPoint = new Point((int) Math.sin(radians), (int) Math.cos(radians));
		path.add(new Segment(position, position.add(versorPoint.multiplyBy(steps))));
		position = position.add(versorPoint.multiplyBy(steps));
	}

	public void showStringPath() {
		System.out.println("************* ALL SEGMENTS WALKED WITHOUT TOUCH **************");
		for (Segment segment : path) {
			System.out.println(segment.getStartPoint().toString() + " -> " + segment.getEndPoint().toString());
		}
		System.out.println("**********************************************");
	}

}
