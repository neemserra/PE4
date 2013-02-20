package neem.palindromes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


import org.junit.Before;
import org.junit.Test;


public class testPalindromes {
	private Palindromes testObject;
	
	@Before
	public void setUp() {
		int numberOfDigits = 2;
		testObject = new Palindromes(numberOfDigits);	
	}
	
	@Test
	public final void testGeneratePotentialPalindromes() {
		//Assemble
		List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 15, 21, 24, 27, 20, 28, 32, 36, 25, 30, 35, 40, 45, 42, 48, 54, 49, 56, 63, 64, 72, 81);
		//Act
		List<Integer> actualList = new ArrayList<Integer>();
		actualList = testObject.generatePotentialPalindromes(1);
		
		//Assert
		assertEquals(expectedList, actualList);
	}


	@Test
	public final void testIsPalindrome() {
		//Assemble
		List<Integer> expectedPalindromeList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//Act
		List<Integer> actualList = new ArrayList<Integer>();
		List<Integer> actualPalindromeList = new ArrayList<Integer>();
		actualList = testObject.generatePotentialPalindromes(1);
		actualPalindromeList = testObject.isPalindrome(actualList);
		
		//Assert
		assertEquals(expectedPalindromeList, actualPalindromeList);
	}
	
	
	@Test
	public final void testLargestPalindrome() {
		//Assemble
		int expectedLargestPalindrome = 9;
		
		//Act
		List<Integer> actualList = new ArrayList<Integer>();
		List<Integer> actualPalindromeList = new ArrayList<Integer>();
		actualList = testObject.generatePotentialPalindromes(1);
		actualPalindromeList = testObject.isPalindrome(actualList);
		int actualLargestPalindrome = testObject.largestPalindrome(actualPalindromeList);
		
		//Assert
		assertEquals(expectedLargestPalindrome, actualLargestPalindrome);
	}

}
