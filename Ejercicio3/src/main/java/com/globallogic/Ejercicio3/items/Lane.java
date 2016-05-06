package com.globallogic.Ejercicio3.items;

public class Lane {
	private Car[] cars;
	private Lane nextLane;
	private int limitCars;

	public Lane(final int limitCars, final Lane nextLane) {
		cars = new Car[limitCars];
		this.limitCars = limitCars;
		this.nextLane = nextLane;
	}

	public Lane getNextLane() {
		return nextLane;
	}

	public synchronized Car[] getCars() {
		return cars;
	}

	public synchronized boolean add(Car car) {
		if (cars[0] == null) {
			cars[0] = car;
			return true;
		} else {
			return false;
		}
	}

	public synchronized void tryForward(int position) throws InterruptedException {
		Car car = cars[position];
		// Last car of a Lane
		if (position >= limitCars - 1) {
			if (nextLane != null && nextLane.cars[0] != null) {
				car.wait();
			}
			if (nextLane != null && nextLane.cars[0] == null) {
				if(!nextLane.add(car)){
					car.wait();
				}
				car.setLane(nextLane);
				car.setPosition(0);
			}
			cars[limitCars - 1] = null;
			notifyAll();
		// Car in a Lane
		} else if (position <= limitCars && cars[position + 1] == null) {
			cars[position + 1] = cars[position];
			cars[position] = null;
			car.setPosition(position + 1);
			cars[position-1].notify();
		} else {
			car.wait();
		}
	}

}
