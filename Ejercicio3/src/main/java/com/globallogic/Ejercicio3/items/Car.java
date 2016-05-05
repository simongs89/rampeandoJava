package com.globallogic.Ejercicio3.items;

import java.util.concurrent.TimeUnit;

public class Car extends Thread {

	private Lane lane;
	private int position = 0;
	private final String carName;

	public Car(final String message) {
		super(message);
		this.carName = message;
	}
	
	public String getCarName() {
		return carName;
	}

	public void setLane(final Lane lane) {
		this.lane = lane;
	}

	public void run() {
		while (lane != null) {
			try {
				//TODO espere 1 solo seg
				TimeUnit.SECONDS.sleep(2);
				//TODO cambiar por dormir y despertar (notifications)
				checkAndGo();
			//TODO interrupcion no causa salida del metodo
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void checkAndGo() {
		Car[] cars = lane.getCars();
		if (position >= cars.length - 1 && lane.removeCar(this)) {
			lane = lane.getNextLane();
			position = 0;
		} else if (position < cars.length - 1 && cars[position + 1] == null) {
			cars[position + 1] = cars[position];
			cars[position] = null;
			position++;
		}
	}

}
