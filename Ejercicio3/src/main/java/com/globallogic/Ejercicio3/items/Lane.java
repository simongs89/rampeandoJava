package com.globallogic.Ejercicio3.items;

public class Lane {
	private Car[] cars;
	private Lane nextLane;

	public Lane(final int limitCars, final Lane nextLane) {
		cars = new Car[limitCars];
		this.nextLane = nextLane;
	}

	public Car[] getCars() {
		return cars;
	}

	public void add(Car car) {
		cars[0] = car;
	}
	
	public boolean removeCar(Car car) {
		if(nextLane == null){
			cars[cars.length-1] = null;
			return true;
		}
		if(!nextLane.isFull()){
			cars[cars.length-1] = null;
			nextLane.add(car);
			return true;
		}
		return false;
	}

	public boolean isFull() {
		return cars[0] != null;
	}

	public Lane getNextLane() {
		return nextLane;
	}

}
