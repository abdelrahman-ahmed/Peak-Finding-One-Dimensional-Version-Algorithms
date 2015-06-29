package com.tddalgorithmstestcases.peakfinding;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tddalgorithms.peakfinding.PeakFinding1DDivideAndConquer;

/**
 * @author Abdelrahman Shaheen
 *
 */
public class PeakFinding1DDivideAndConquerTest {

//	@Test
//	public void testForInputLenghtZeroShouldReturnNull() {
//		Integer[] input = {};
//		Integer actualPeak = PeakFinding1DDivideAndConquer.findPeak(input);
//		assertNull(actualPeak);
//	}
//
//	@Test
//	public void testForInputContainsOneShouldReturnThatItem() {
//		Integer[] input = { 6 };
//		Integer actualPeak = PeakFinding1DDivideAndConquer.findPeak(input);
//		assertEquals(new Integer(6), actualPeak);
//	}
//
//	@Test
//	public void testMidItemIsPeakShouldMiddleItem() {
//		Integer[] input = { 1, 4, 3 };
//		Integer actualPeak = PeakFinding1DDivideAndConquer.findPeak(input);
//		assertEquals(new Integer(4), actualPeak);
//		}
//	
	@Test
	public void testPeakIsInTheRightHalf() {
		Integer[] input = { 1, 2, 3,4,1 };
		Integer actualPeak = PeakFinding1DDivideAndConquer.findPeak(input);
		assertEquals(new Integer(4), actualPeak);
	}

	@Test
	public void testPeakIsInTheLefttHalf() {
		Integer[] input = { 1, 4, 3,2,0 };
		Integer actualPeak = PeakFinding1DDivideAndConquer.findPeak(input);
		assertEquals(new Integer(4), actualPeak);
	}
}
