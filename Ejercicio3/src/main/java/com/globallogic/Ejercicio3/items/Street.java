package com.globallogic.Ejercicio3.items;

import java.util.concurrent.TimeUnit;

public class Street extends Thread {

	private static final int CARS_BY_LANE = 3;

	private Lane exitLane = new Lane(CARS_BY_LANE, null);
	
	private Lane leftLane = new Lane(CARS_BY_LANE, exitLane);
	private Lane centerLane = new Lane(CARS_BY_LANE, exitLane);
	private Lane rightLane = new Lane(CARS_BY_LANE, exitLane);


	public void add(Car car, final Side laneSide) {
		Lane lane;
		if (laneSide == Side.LEFT) {
			lane = leftLane;
		} else if (laneSide == Side.CENTER) {
			lane = centerLane;
		} else {
			lane = rightLane;
		}
		if (!lane.isFull()) {
			lane.add(car);
			car.setLane(lane);
			car.start();
		}
	}

	public void run() {
		while (true) {
			try {
				TimeUnit.SECONDS.sleep(1);
				for (int clear = 0; clear < 1000; clear++) {
					System.out.println("\b");
				}

				printLeftLane();
				printCenterLane();
				printRightLane();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void printLeftLane(){
		System.out.println("________________________");
		for (Car car : leftLane.getCars()) {
			String carName = (car == null) ? "   " : car.getCarName();
			System.out.print("(" + carName + ")  ");
		}
		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	}
	
	private void printCenterLane(){
		// CARRIL CENTRO
		for (Car car : centerLane.getCars()) {
			String carName = (car == null) ? "   " : car.getCarName();
			System.out.print("(" + carName + ")  ");
		}
		
		for (Car car : exitLane.getCars()) {
			String carName = (car == null) ? "   " : car.getCarName();
			System.out.print("   (" + carName + ")  ");
		}

		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	}
	
	private void printRightLane(){
		for (Car car : rightLane.getCars()) {
			String carName = (car == null) ? "   " : car.getCarName();
			System.out.print("(" + carName + ")  ");
		}
		System.out.println();
		System.out.println("________________________");
	}

	public void resolveIntersection() {

	}

}
