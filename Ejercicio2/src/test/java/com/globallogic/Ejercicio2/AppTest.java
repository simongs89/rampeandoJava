package com.globallogic.Ejercicio2;

import com.globallogic.Ejercicio2.items.Combination;
import com.globallogic.Ejercicio2.items.Matrix;
import com.globallogic.Ejercicio2.items.MatrixResolver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {

		Matrix matrix = new Matrix();

		int MATRIX_SIZE = 3;
		int[][] multidimensionalArray = new int[MATRIX_SIZE][MATRIX_SIZE];
		Combination betterCombination;

		/*// MATRIZ UNO
		System.out.println("---------------");
		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				multidimensionalArray[i][j] = i * MATRIX_SIZE + j;
				System.out.print("| " + multidimensionalArray[i][j] + " |");
			}
			System.out.println();
			System.out.println("---------------");
		}
		betterCombination = matrix.getBetterCombination(multidimensionalArray);
		System.out.println(betterCombination.getMovements());
		System.out.println(betterCombination.getValue());
		assertEquals(24, betterCombination.getValue());

		// MATRIZ DOS
		System.out.println("---------------");
		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				multidimensionalArray[i][j] = i * j;
				System.out.print("| " + multidimensionalArray[i][j] + " |");
			}
			System.out.println();
			System.out.println("---------------");
		}
		betterCombination = matrix.getBetterCombination(multidimensionalArray);
		System.out.println(betterCombination.getMovements());
		System.out.println(betterCombination.getValue());
		assertEquals(7, betterCombination.getValue());

		// MATRIZ TRES
		System.out.println("---------------");
		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				multidimensionalArray[i][j] = 3 + i * j * i;
				System.out.print("| " + multidimensionalArray[i][j] + " |");
			}
			System.out.println();
			System.out.println("---------------");
		}
		betterCombination = matrix.getBetterCombination(multidimensionalArray);
		System.out.println(betterCombination.getMovements());
		System.out.println(betterCombination.getValue());
		assertEquals(28, betterCombination.getValue());

		// MATRIZ CUATRO
		System.out.println("---------------");
		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				if (i == j) {
					multidimensionalArray[i][j] = 30;

				} else {
					multidimensionalArray[i][j] = 1 + i * i;
				}
				System.out.print("| " + multidimensionalArray[i][j] + " |");
			}
			System.out.println();
			System.out.println("---------------");
		}
		betterCombination = matrix.getBetterCombination(multidimensionalArray);
		System.out.println(betterCombination.getMovements());
		System.out.println(betterCombination.getValue());
		assertEquals(97, betterCombination.getValue());*/

		// MATRIZ CINCO
		multidimensionalArray[0][0] = 1;
		multidimensionalArray[0][1] = 1;
		multidimensionalArray[0][2] = 9;
		multidimensionalArray[1][0] = 3;
		multidimensionalArray[1][1] = 4;
		multidimensionalArray[1][2] = 9;
		multidimensionalArray[2][0] = 5;
		multidimensionalArray[2][1] = 8;
		multidimensionalArray[2][2] = 2;
		System.out.println("---------------");
		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				System.out.print("| " + multidimensionalArray[i][j] + " |");
			}
			System.out.println();
			System.out.println("---------------");
		}
		
		//betterCombination = matrix.getBetterCombination(multidimensionalArray);
		//System.out.println(betterCombination.getMovements());
		//System.out.println(betterCombination.getValue());
		//assertEquals(22, betterCombination.getValue());
		
		MatrixResolver resolver = new MatrixResolver();
		assertEquals(22, resolver.getMaxWeight(multidimensionalArray, 0, 0));
	}
}
