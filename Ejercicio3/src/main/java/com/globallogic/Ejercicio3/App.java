package com.globallogic.Ejercicio3;

import java.util.concurrent.TimeUnit;

import com.globallogic.Ejercicio3.items.Car;
import com.globallogic.Ejercicio3.items.Side;
import com.globallogic.Ejercicio3.items.Street;

public class App {
	public static void main(String[] args) {

		try {
			Street street = new Street();
			street.start();

			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("GOL"), Side.LEFT);
			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("206"), Side.CENTER);
			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("128"), Side.RIGHT);

			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("GOL"), Side.LEFT);
			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("206"), Side.CENTER);
			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("128"), Side.RIGHT);
			
			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("GOL"), Side.LEFT);
			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("206"), Side.CENTER);
			TimeUnit.SECONDS.sleep(1);
			street.add(new Car("128"), Side.RIGHT);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
