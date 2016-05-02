package com.globallogic.items;

import java.util.ArrayList;

public class TurtleManager {

	//TODO final ?
	public int solution(int[] array) {

		Turtle turtle = new Turtle(new Point(0, 0));

		for (int i : array) {

			turtle.go(i);
			turtle.rotate(90);

			ArrayList<Segment> path = turtle.giveMeYourPath();
			
			//TODO ahorrarse este if
			if (path.size() > 1) {
				Segment lastSegment = path.get(path.size() - 1);
				for (Segment segment : path) {
					if (segment != lastSegment && segment.checkIsCut(lastSegment)) {
						turtle.showStringPath();
						return ++i;
					}
				}
			}
		}
		turtle.showStringPath();
		return 0;
	}
}
