package com.tddalgorithms.peakfinding;

/**
 * @author Abdelrahman Shaheen
 *
 */
public class PeakFinding1DVersionLinearTime {

	public static Integer findPeak(Integer[] input) {

		if (inputContainsNoItems(input))
			return null;
		else if (inputContainsOneItemOnly(input))
			return input[0];
		else if (firstItemIsPeak(input))
			return input[0];
		else {
			for (int index = 1; index < input.length - 1; index++) {
				if (isPeak(input, index))
					return input[index];
			}

			if (lastItemIsPeak(input, input.length - 1))
				return input[input.length - 1];
		}

		return null;
	}

	private static boolean inputContainsNoItems(Integer[] input) {
		return input.length == 0;
	}

	private static boolean inputContainsOneItemOnly(Integer[] input) {
		return input.length == 1;
	}

	private static boolean firstItemIsPeak(Integer[] input) {
		return input[0] >= input[1];
	}

	private static boolean lastItemIsPeak(Integer[] input, int index) {
		return input[index] >= input[index - 2];
	}

	private static boolean isPeak(Integer[] input, int index) {
		return checkRightNeighbour(input, index)
				&& checkLeftNeighbour(input, index);
	}

	private static boolean checkLeftNeighbour(Integer[] input, int index) {
		return input[index] >= input[index + 1];
	}

	private static boolean checkRightNeighbour(Integer[] input, int index) {
		return input[index] >= input[index - 1];
	}

}
