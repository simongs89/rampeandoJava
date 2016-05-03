package com.globallogic.Ejercicio2.items;

import java.util.ArrayList;

final public class MatrixResolver {

	private static final char MOVE_DOWN = '1';
	private static final char MOVE_RIGHT = '0';
	
	private static int stack = 0;

	public Combination resolveBetter(final int[][] matrix, final ArrayList<Combination> combinations) {

		Combination betterCombination = combinations.get(0);
		for (Combination combination : combinations) {
			int row = 0, column = 0;
			combination.add(matrix[row][column]);
			for (char move : combination.getMovements()) {
				if (move == MOVE_DOWN) {
					row++;
				} else if(move == MOVE_RIGHT){
					column++;
				}
				combination.add(matrix[row][column]);
			}
			if (betterCombination.getValue() < combination.getValue()) {
				betterCombination = combination;
			}
		}

		return betterCombination;
	}
	
	public int getMaxWeight(final int[][] matrix, int row, int col){
		if(row >= matrix[0].length || col >= matrix.length){
			return 0;
		}else{
			System.out.println("STACK ABIERTO " + stack++);
			int byDown = getMaxWeight(matrix, row+1, col);
			int byRight = getMaxWeight(matrix, row, col+1);
			return matrix[row][col] + (byDown>byRight ? byDown : byRight);
		}
	}

}
