package de.unistuttgart.vis.dsass2021.ex02.p3;

import static org.junit.Assert.*;

import org.junit.Test;

import de.unistuttgart.vis.dsass2021.ex02.p3.ISimpleList;
import de.unistuttgart.vis.dsass2021.ex02.p3.Sorter;


public class SorterTest {
	
@Test	
	public void testSorter1() {
	
	ISimpleList simList = new SimpleList();
	simList.append(3);
	simList.append(5);
	simList.append(2);
	simList.append(1);
	simList.append(4);
		Sorter.selectionSort(simList);
		ISimpleList expList = new SimpleList();
		expList.append(5);
		expList.append(4);
		expList.append(3);
		expList.append(2);
		expList.append(1);
		
		assertEquals(expList,simList);
	}

@Test	
public void testSorter2() {

ISimpleList simList = new SimpleList();
simList.append(3);
simList.append(5);
simList.append(2);
simList.append(1);
simList.append(4);
	Sorter.insertionSort(simList);
	ISimpleList expList = new SimpleList();
	expList.append(5);
	expList.append(4);
	expList.append(3);
	expList.append(2);
	expList.append(1);
	
	assertEquals(expList,simList);
}

@Test	
public void testSorter3() {

ISimpleList simList = new SimpleList();
simList.append(3);
simList.append(5);
simList.append(2);
simList.append(1);
simList.append(4);
	Sorter.bubbleSort(simList);
	ISimpleList expList = new SimpleList();
	expList.append(1);
	expList.append(2);
	expList.append(3);
	expList.append(4);
	expList.append(5);
	
	assertEquals(expList,simList);
}
    
}
