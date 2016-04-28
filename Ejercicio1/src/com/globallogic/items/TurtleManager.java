package com.globallogic.items;

import java.util.ArrayList;

public class TurtleManager {
	public static int solution(int[] array) {
		
		Turtle turtle = new Turtle(new Point(0, 0));
		int countDirection = 0;
		
		for (int i = 0; i < array.length; i++) {
			countDirection++;
			
			if(countDirection > Direction.values().length){
				countDirection = 1;
			}
			
			Direction direction;
			switch (countDirection) {
			case 1:
				direction = Direction.NORTH;
				break;
			case 2:
				direction = Direction.EAST;
				break;
			case 3:
				direction = Direction.SOUTH;
				break;
			default:
				direction = Direction.WEST;
				break;
			}
			
			turtle.go(array[i], direction);
		}
		turtle.showYourPath();
		
		
		ArrayList<Point> points = turtle.giveMeYourPath();
		
		for (Point point : points) {
			for (Point checkPoint : points) {
				Point u1 = null, u2 = null, v1 = null, v2 = null;
				try {					
					u1 = point;
					u2 = points.get(points.indexOf(point)+1);
					v1 = checkPoint;
					v2 = points.get(points.indexOf(checkPoint)+1);
				} catch (Exception e) {
					break;
				}
				if (Calculator.checkSegmentCut(u1, u2, v1, v2)) {
					return points.indexOf(v2);
				}
			}
		}
		
		return 0;
	}
}
