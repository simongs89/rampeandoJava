package com.globallogic.items;

import java.util.ArrayList;

public class TurtleManager {

	public int solution(final int[] array) {

		Turtle turtle = new Turtle(new Point(0, 0));

		for (int i : array) {

			turtle.go(i);
			turtle.rotate(Math.PI / 2);

			ArrayList<Segment> path = turtle.giveMeYourPath();

			Segment lastSegment = path.get(path.size() - 1);
			for (Segment segment : path) {
				if (segment != lastSegment && !segment.checkIsntCut(lastSegment)) {
					turtle.showStringPath();
					return ++i;
				}
			}

		}
		turtle.showStringPath();
		return 0;
	}
}
