package com.globallogic.items;

public class Segment {
	private Point startPoint;
	private Point endPoint;

	public Segment(Point startPoint, Point endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	public boolean checkIsCut(Segment segment){
		return Calculator.checkIntersection(this, segment);
	}
}
