package com.uws.linkedlist.secondClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.uws.linkedlist.SortedADT.NotFoundException;

class SortedADTTest {

	/**
	 * This test is based on the example in slide 3
	 */
	@Test
	void insert20IntoTheList() {
		Comparable testSubject = new Integer(20);
		
		SortedADT myLinkedList = new SortedLinkedList();
		
		myLinkedList.insert(testSubject);
		
		int actualNumberOfElements = myLinkedList.countElements();
		
		assertEquals(1, actualNumberOfElements);
		
	}
	
	
	/**
	 * Its related to slide 6,8,13 (Traversing)
	 * This should test insert (6) and find (slide 13).
	 * 
	 * 
	 * @throws NotFoundException
	 * @throws com.uws.linkedlist.secondClass.SortedADT.NotFoundException 
	 */
	@Test
	void testInsertAndFind() throws NotFoundException, com.uws.linkedlist.secondClass.SortedADT.NotFoundException {
		Comparable testSubject = new Integer(3);
		
		SortedADT myLinkedList = new SortedLinkedList();
		
		myLinkedList.insert(testSubject);
		
		Comparable output = myLinkedList.find(testSubject);
		
		assertEquals(new Integer(3), output);
	}
	
	//todo: Complete with other test to assure that Find is correctly implemented
	
	
	/*
	 * just another example. Of algorithms that can be done with a linked list
	 */
	@Test
	void testReverse() {
		SortedLinkedList sorted = new SortedLinkedList();
        sorted.insert(3);
        sorted.insert(5);
        sorted.insert(6);
        sorted.insert(7);
        sorted.insert(8);
        
        SortedLinkedList reversed = sorted.reverse();
        
        
        int output = reversed.findIndex(8);
        assertEquals(0, output);
        output = reversed.findIndex(7);
        assertEquals(1, output);
        output = reversed.findIndex(6);
        assertEquals(2, output);
        output = reversed.findIndex(5);
        assertEquals(3, output);
        output = reversed.findIndex(3);
        assertEquals(4, output);
	}
	
	
	@Test
	void testFindAnElementThatIsNotPresent() throws com.uws.linkedlist.secondClass.SortedADT.NotFoundException {
		SortedLinkedList sorted = new SortedLinkedList();
        sorted.insert(3);
        sorted.insert(8);
        sorted.insert(9);
        sorted.insert(10);
        sorted.insert(20);
        
        assertEquals(5, sorted.countElements());
        
        Integer foundElement = (Integer) sorted.find(7);
        
        assertNull(foundElement);
	}

}
