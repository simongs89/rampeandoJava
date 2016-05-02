package com.globallogic.items;

//TODO no usar "this"
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

	//TODO final param ?
	public Point multiplyPerConstant(int k){
		return new Point(this.x * k, this.y * k);
	}
	
	//TODO final param ?
	public Point addPoint(Point point){
		//TODO quitar get usar directamente para ahorrar llamadas
		return new Point(this.x + point.getX(), this.y + point.getY());
	}
	
	//TODO override
	public String toString(){
		return "(" + getX() + "," + getY() + ")";
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(toString());
	}

	@Override
	public boolean equals(Object point) {
		//TODO verificar clase
		return point != null && ((Point)point).getX() == this.x && ((Point)point).getY() == this.y;
	}
	
	
}
