package com.globallogic;

import com.globallogic.items.TurtleManager;

/**
* The Main program implements an application that
* control movement and position of a dummy turtle.
*
* @author  Simón Gómez
* @version 1.0
* @since   2016-05-02 
*/
public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[9];
		for (int i = 0; i < args.length; i++) {
			array[i] = Integer.valueOf(args[i]);
		}
		
		TurtleManager manager = new TurtleManager();
		System.out.println("FIRST TOUCH PREVIOS PATH AT MOVEMENT: " + manager.solution(array));
	}

}
