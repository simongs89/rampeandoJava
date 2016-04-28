package com.globallogic.items;

public class Calculator {
	private static int getTriangleArea(Point pointA, Point pointB, Point pointC) {
		return (pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY())
				- (pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY());
	}

	private static String pointRelativeToSegment(Point pointA, Point pointB, Point p) {
		int area = getTriangleArea(pointA, pointB, p);
		if (area > 0)
			return "izquierda";
		else if (area < 0)
			return "derecha";
		else
			return "colineal";
	}

        //TODO solucionar en una sola linea.
        //TODO analizar posible clase Segment
	public static boolean checkSegmentCut(Point u1, Point u2, Point v1, Point v2) {
		if (pointRelativeToSegment(u1, u2, v1) == "colineal" || pointRelativeToSegment(u1, u2, v2) == "colineal"
				|| pointRelativeToSegment(v1, v2, u1) == "colineal"
				|| pointRelativeToSegment(v1, v2, u2) == "colineal") {
			return false;
		} else
			if (((pointRelativeToSegment(u1, u2, v1) == "izquierda" && pointRelativeToSegment(u1, u2, v2) == "derecha")
					|| (pointRelativeToSegment(u1, u2, v1) == "derecha"
							&& pointRelativeToSegment(u1, u2, v2) == "izquierda"))
					&& ((pointRelativeToSegment(v1, v2, u1) == "derecha"
							&& pointRelativeToSegment(v1, v2, u2) == "izquierda")
							|| (pointRelativeToSegment(v1, v2, u1) == "izquierda"
									&& pointRelativeToSegment(v1, v2, u2) == "derecha"))) {
			return true;
		} else {
			return false;
		}
	}
}
