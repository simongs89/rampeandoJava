package com.globallogic.Ejercicio2.items;

import java.util.ArrayList;

final public class Matrix {

	public Combination getBetterCombination(final int[][] matrix) {

		int numberMoves = (2 * matrix[0].length) - 2; // (2*N)-2

		ArrayList<Combination> combinations = new ArrayList<Combination>();

		for (int numberComb = 0; numberComb < Math.pow(2, numberMoves); numberComb++) {
			String movements = String.format("%" + numberMoves + "s", Integer.toBinaryString(numberComb)).replace(" ", "0");
			if (hasSameOnesAndZeros(movements, numberMoves/2)) {
				combinations.add(new Combination(movements.toCharArray()));
			}
		}

		MatrixResolver resolver = new MatrixResolver();
		return resolver.resolveBetter(matrix, combinations);
	}

	private boolean hasSameOnesAndZeros(final String combination, int quantity) {
		int countOne = 0, countZero = 0;
		for (char character : combination.toCharArray()) {
			if (character == '1') {
				countOne++;
			}else{
				countZero++;
			}
		}
		return countOne == countZero && countOne == quantity;
	}

}
