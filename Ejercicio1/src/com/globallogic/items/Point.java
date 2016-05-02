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

	public Point multiplyBy(final int k) {
		return new Point(x * k, y * k);
	}

	public Point add(final Point point) {
		return new Point(x + point.x, y + point.y);
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public int hashCode() {
		return Integer.valueOf(toString());
	}

	@Override
	public boolean equals(final Object point) {
		return point != null && point instanceof Point && ((Point) point).x == x && ((Point) point).y == y;
	}

}
