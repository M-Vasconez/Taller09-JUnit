/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Matias
 */
public class MovieTest {

    public MovieTest() {
    }

    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;

    @BeforeEach
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);

    }

    /**
     * Test of getPriceCode method, of class Movie.
     */
    @Test
    public void testGetPriceCodeRegular() {
        System.out.println("getPriceCode");
        int expResult = Movie.REGULAR;
        int result = theManWhoKnewTooMuch.getPriceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPriceCodeChildrens() {
        System.out.println("getPriceCode");
        int expResult = Movie.CHILDRENS;
        int result = mulan.getPriceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPriceCodeNewRelease() {
        System.out.println("getPriceCode");
        int expResult = Movie.NEW_RELEASE;
        int result = slumdogMillionaire.getPriceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceCode method, of class Movie.
     */
    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = 5;
        theManWhoKnewTooMuch.setPriceCode(arg);
        mulan.setPriceCode(arg);
        slumdogMillionaire.setPriceCode(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
