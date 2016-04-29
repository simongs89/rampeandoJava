package com.globallogic.items;

//TODO cambiar a inmutable
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
	
	//TODO recibir parametros con "final"
	public boolean checkIsCut(Segment segment){
		return Calculator.checkIntersection(this, segment);
	}
}
