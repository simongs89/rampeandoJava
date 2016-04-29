package com.globallogic.items;

import java.util.ArrayList;

public class TurtleManager {
	
	public int solution(int[] array) {
		
		//TODO setear la tortuga mirando para arriba
		Turtle turtle = new Turtle(new Point(0, 0));
		//TODO variable no usada
		int countDirection = 0;
		
		for (int i : array) {
			countDirection++;
			
			if(countDirection > 4){
				countDirection = 1;
			}
			
			turtle.rotate(90);
			turtle.go(i);
			
			//TODO probar solo el ultimo movimiento ya que los otros ya no se tocaron
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
					Segment s1 = new Segment(u1, u2);
					Segment s2 = new Segment(v1, v2);
					if (s1.checkIsCut(s2)) {
						turtle.showStringPath();
						return points.indexOf(v2);
					}
				}
			}
		}
		turtle.showStringPath();
		return 0;
	}
}
