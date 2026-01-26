package com.JUnit.testingoperations;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @Before
    public void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    // Test adding elements
    @org.junit.Test
    public void testAddElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        assertEquals(2, listManager.getSize(list));
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    // Test removing elements
    @Test
   public void testRemoveElement() {
        list.add(10);
        list.add(20);

        listManager.removeElement(list, 10);

        assertEquals(1, listManager.getSize(list));
        assertFalse(list.contains(10));
        assertTrue(list.contains(20));
    }

    // Test list size
    @Test
   public void testGetSize() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 15);
        listManager.addElement(list, 25);

        assertEquals(3, listManager.getSize(list));
    }
}