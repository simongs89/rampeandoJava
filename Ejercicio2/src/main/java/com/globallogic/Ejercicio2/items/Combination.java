package com.globallogic.Ejercicio2.items;

public class Combination {

	private final String movements;
	private int value = 0;
	
	public Combination(final String movements) {
		this.movements = movements;
	}
	
	public String getMovements() {
		return movements;
	}
	
	public void add(final int value){
		this.value += value;
	}
	
	public int getValue() {
		return value;
	}
}
