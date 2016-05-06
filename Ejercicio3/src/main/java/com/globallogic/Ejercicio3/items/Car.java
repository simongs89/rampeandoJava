package com.globallogic.Ejercicio3.items;

import java.util.concurrent.TimeUnit;

public class Car extends Thread {

	private Lane lane;
	private int position = 0;
	
	public Car(final String message) {
		super(message);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void setLane(final Lane lane) {
		this.lane = lane;
	}

	public void run() {
		while (lane != null) {
			try {
				TimeUnit.SECONDS.sleep(1);
				lane.tryForward(position);
			} catch (InterruptedException e) {} 
			catch (Exception e) {}
		}
	}

}
