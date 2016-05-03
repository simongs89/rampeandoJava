package com.globallogic.Ejercicio2.items;

public class Combination {

	private final char[] movements;
	private int value = 0;
	
	public Combination(final char[] movements) {
		this.movements = movements;
	}
	
	public char[] getMovements() {
		return movements;
	}
	
	public void add(final int value){
		this.value += value;
	}
	
	public int getValue() {
		return value;
	}
}
