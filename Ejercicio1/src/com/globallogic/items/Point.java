package com.globallogic.items;

final public class Point {
	
	private final int x;
	private final int y;
	
	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point multiplyPerConstant(int k){
		return new Point(this.x * k, this.y * k);
	}
	
	public Point addPoint(Point point){
		return new Point(this.x + point.getX(), this.y + point.getY());
	}
	
	public String toString(){
		return "(" + getX() + "," + getY() + ")";
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(toString());
	}

	@Override
	public boolean equals(Object point) {
		return point != null && ((Point)point).getX() == this.x && ((Point)point).getY() == this.y;
	}
	
	
}
