package com.tddalgorithms.peakfinding;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PeakFinding1DVersionLinearTimeTest {

	@Test
	public void testProblemOfSizeZeroShouldReturnNull() {
		Integer[] problem = {};
		Integer peak = PeakFinding1DVersionLinearTime.findPeak(problem);
		assertNull(peak);
	}

	@Test
	public void testProblemOfSizeZeroIfReturnZeroShouldFail() {
		Integer[] problem = {};
		Integer peak = PeakFinding1DVersionLinearTime.findPeak(problem);
		assertNotEquals(peak, new Integer(0));
	}

	@Test
	public void testProblemOneItemShouldReturnThatItem() {
		Integer[] problem = { 1 };
		Integer peak = PeakFinding1DVersionLinearTime.findPeak(problem);
		assertEquals(new Integer(1), peak);
	}

	@Test
	public void testFirstItemShouldReturnedAsPeakIfGreaterThanItem1() {
		Integer[] problem = { 1, 0 };
		Integer peak = PeakFinding1DVersionLinearTime.findPeak(problem);
		assertEquals(new Integer(1), peak);
	}

	@Test
	public void testProblemOfNSizeSouldRetrunFirstPeak() {
		Integer[] problem = { 1, 2, 3, 5, 4 };
		Integer peak = PeakFinding1DVersionLinearTime.findPeak(problem);
		assertEquals(new Integer(5), peak);
	}

	@Test
	public void testLastItemIsAPeak() {
		Integer[] problem = { 1, 2, 4, 5, 6 };
		Integer peak = PeakFinding1DVersionLinearTime.findPeak(problem);
		assertEquals(new Integer(6), peak);
	}

	@Test
	public void testIfAllItemsIsTheSame() {
		Integer[] problem = { 2, 2, 2, 2, 2 };
		Integer peak = PeakFinding1DVersionLinearTime.findPeak(problem);
		assertEquals(new Integer(2), peak);
	}

}
