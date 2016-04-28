package com.globallogic.items;

//TODO ver lombok (opcional)
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//TODO soportar multiplicacion por K y suma de Point
	
	//TODO es un toString ?
	public String getPosition(){
		return "(" + getX() + "," + getY() + ")";
	}
	
	//TODO que mas falta hacer si cambias el equals ?
	public boolean equals(Point point) {
		return point.getX() == this.x && point.getY() == this.y;
	}
}
