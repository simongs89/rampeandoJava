package com.globallogic.items;

final public class Segment {
	private static final String RELATION_RIGHT = "derecha";
	private static final String RELATION_LEFT = "izquierda";
	private static final String RELATION_COLINEAL = "colineal";
	private final Point startPoint;
	private final Point endPoint;

	public Segment(final Point startPoint, final Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public boolean checkIsntCut(final Segment s2) {
		Point u1 = getStartPoint();
		Point u2 = getEndPoint();
		Point v1 = s2.getStartPoint();
		Point v2 = s2.getEndPoint();

		String relationSegmentOne = pointRelativeToSegment(u1, u2, v1);
		String relationSegmentTwo = pointRelativeToSegment(u1, u2, v2);
		String relationSegmentThree = pointRelativeToSegment(v1, v2, u1);
		String relationSegmentFour = pointRelativeToSegment(v1, v2, u2);

		return relationSegmentOne == RELATION_COLINEAL || relationSegmentTwo == RELATION_COLINEAL
				|| relationSegmentThree == RELATION_COLINEAL || relationSegmentFour == RELATION_COLINEAL
				|| !(((relationSegmentOne == RELATION_LEFT && relationSegmentTwo == RELATION_RIGHT)
						|| (relationSegmentOne == RELATION_RIGHT && relationSegmentTwo == RELATION_LEFT))
						&& ((relationSegmentThree == RELATION_RIGHT && relationSegmentFour == RELATION_LEFT)
								|| (relationSegmentThree == RELATION_LEFT && relationSegmentFour == RELATION_RIGHT)));

	}

	private String pointRelativeToSegment(final Point pointA, final Point pointB, final Point p) {
		int area = getTriangleArea(pointA, pointB, p);
		if (area > 0)
			return RELATION_LEFT;
		else if (area < 0)
			return RELATION_RIGHT;
		else
			return RELATION_COLINEAL;
	}

	private int getTriangleArea(final Point pointA, final Point pointB, final Point pointC) {
		return (pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY())
				- (pointC.getX() - pointA.getX()) * (pointB.getY() - pointA.getY());
	}
}
