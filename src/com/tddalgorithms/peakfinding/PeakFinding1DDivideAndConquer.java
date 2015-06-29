package com.tddalgorithms.peakfinding;

import java.util.Arrays;

/**
 * @author Abdelrahman Shaheen
 *
 */
public class PeakFinding1DDivideAndConquer {

	public static Integer findPeak(Integer[] input) {

		if (inputContainsNoItems(input))
			return null;
		else if (inputContainsOneItemOnly(input))
			return input[0];
		else {
			if (middleItem(input) < leftNighbourOfTheMiddleItem(input))
				return findPeak(leftHalfOfTheArrayMiddleExcluded(input));
			else if (middleItem(input) <= rightNighbourOfTheMiddleItem(input))
				return findPeak(rightHalfOfTheArrayMiddleExcluded(input));
			else
				return middleItem(input);
		}
	}

	private static boolean inputContainsOneItemOnly(Integer[] input) {
		return input.length == 1;
	}

	private static boolean inputContainsNoItems(Integer[] input) {
		return input.length == 0;
	}

	private static Integer[] leftHalfOfTheArrayMiddleExcluded(Integer[] input) {
		return Arrays.copyOfRange(input, 0, input.length / 2);
	}

	private static Integer[] rightHalfOfTheArrayMiddleExcluded(Integer[] input) {
		return Arrays.copyOfRange(input, (input.length + 1) / 2, input.length);
	}

	private static Integer middleItem(Integer[] input) {
		return input[input.length / 2];
	}

	private static Integer leftNighbourOfTheMiddleItem(Integer[] input) {
		return input[input.length / 2 - 1];
	}

	private static Integer rightNighbourOfTheMiddleItem(Integer[] input) {
		return input[input.length / 2];
	}

}
