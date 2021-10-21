/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author id500182
 */
public abstract class FruitSimpleTest {
    /*
    public FruitSimpleTest() {
    }
    abstract FruitSimple createFruit(double prix,String origine);
    abstract FruitSimple createFruitNull();
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    @Test
    public void testGetPrix() {
        FruitSimple fs =createFruit(0.5,"France");
                 double expected =0.5;
                 double result =fs.getPrix();
                 assertTrue(expected==result);
    }
    
    @Test
    public void testPrixNegatif() {
        System.out.println("prix negatif");
        FruitSimple instance = createFruit(-1.0,"Espagne");
        double expResult = 1.0;
        double result = instance.getPrix();
        assertTrue(expResult == result);
    }
    
    @Test
    public void testChaineVide() {
        System.out.println("chaine vide");
        FruitSimple instance = createFruit(1.0,"");
        String expResult = "Espagne";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }
     @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        FruitSimple instance = createFruit(1.0,"");
        String expResult = "Espagne";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetCountry() {
        System.out.println("setOrigine");
        FruitSimple instance = createFruit1.0,"");
        String expResult = "France";
        instance.setOrigine("France");
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }
 @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        FruitSimple instance = createFruit(1.0,"");
        double expResult = 0.7;
        instance.setPrix(0.7);
        double result = instance.getPrix();
        assertTrue(expResult == result);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}*/
}
