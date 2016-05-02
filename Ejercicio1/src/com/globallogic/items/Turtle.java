package com.globallogic.items;

import java.util.ArrayList;

public class Turtle {

	private ArrayList<Segment> path = new ArrayList<>();
	private final Point startPoint;
	private int directionAngle = 0;

	public Turtle(final Point point) {
		this.startPoint = point;
	}

	public ArrayList<Segment> giveMeYourPath() {
		return this.path;
	}

	public void rotate(int degrees) {
		directionAngle += degrees;
	}

	public void go(int steps) {
		Point lastPoint = (path.size() == 0) ? this.startPoint : path.get(path.size() - 1).getEndPoint();
		Point versorPoint = (new Point((int) Math.sin(Math.toRadians(directionAngle)),
				(int) Math.cos(Math.toRadians(directionAngle))));
		path.add(new Segment(lastPoint, lastPoint.addPoint(versorPoint.multiplyPerConstant(steps))));
	}

	public void showStringPath() {
		System.out.println("************* ALL SEGMENTS WALKED WITHOUT TOUCH **************");
		for (Segment segment : path) {
			System.out.println(segment.getStartPoint().toString() + " -> " + segment.getEndPoint().toString());
		}
		System.out.println("**********************************************");
	}

}
