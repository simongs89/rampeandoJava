package com.globallogic.Ejercicio3;

import java.util.concurrent.TimeUnit;

import com.globallogic.Ejercicio3.items.Car;
import com.globallogic.Ejercicio3.items.Street;

public class App {
	public static void main(String[] args) {

		try {
			Street street = new Street();
			street.start();

			TimeUnit.SECONDS.sleep(2);
			street.add(new Car("GOL"), "L");
			street.add(new Car("206"), "C");
			street.add(new Car("128"), "R");
			
			TimeUnit.SECONDS.sleep(2);
			street.add(new Car("GOL"), "L");
			street.add(new Car("206"), "C");
			street.add(new Car("128"), "R");
			
			TimeUnit.SECONDS.sleep(2);
			street.add(new Car("GOL"), "L");
			street.add(new Car("206"), "C");
			street.add(new Car("128"), "R");
			
			TimeUnit.SECONDS.sleep(2);
			street.add(new Car("GOL"), "L");
			street.add(new Car("206"), "C");
			street.add(new Car("128"), "R");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
