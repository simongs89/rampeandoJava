package com.globallogic.items;

import lombok.Data;

//TODO hacer inmutable
public @Data class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point(Double x, Double y) {
		super();
		this.x = x.intValue();
		this.y = y.intValue();
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

	public void multiply(int k){
		this.x *= k;
		this.y *= k;
	}
	
	public void add(Point point){
		this.x += point.getX();
		this.y += point.getY();
	}
	
	public String toString(){
		return "(" + getX() + "," + getY() + ")";
	}
	
	//TODO devolver false si te mandan point en null
	//TODO SIEMPRE QUE SOBRESCRIVAS EL EQUALS TENES QUE SOBRESCRIBIR EL HASHCODE
	@Override
	public boolean equals(Object point) {
		return ((Point)point).getX() == this.x && ((Point)point).getY() == this.y;
	}
}
