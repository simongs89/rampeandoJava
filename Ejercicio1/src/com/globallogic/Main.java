package com.globallogic;

import com.globallogic.items.TurtleManager;

public class Main {

	public static void main(String[] args) {
		// TODO tomar valores desde linea de comandos
		int[] array = new int[9];
		array[0] = 1;
		array[1] = 3;
		array[2] = 2;
		array[3] = 5;
		array[4] = 4;
		array[5] = 4;
		array[6] = 6;
		array[7] = 3;
		array[8] = 2;
		TurtleManager manager = new TurtleManager();
		System.out.println("FIRST TOUCH PREVIOS PATH AT MOVEMENT: " + manager.solution(array));
	}

}
