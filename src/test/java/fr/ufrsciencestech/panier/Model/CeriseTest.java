/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;

import fr.ufrsciencestech.panier.Model.Orange;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author cb778525
 */
public class CeriseTest {
    
    @Before
    public void setUp(){
    }
    
    @Test
    public void testGetOrigine(){
        
        Fruit f = new cerise();
        assertEquals(f.getOrigine(),"Cerise de france");

    }
    
    @Test
    public void testGetPrix(){
        
        Fruit f = new cerise();
        assertTrue(f.getPrix()==1.0);

    }
    
    @Test
    public void testSeedles(){
        
        Fruit f = new cerise();
        assertTrue(f.isSeedless()==false);

    }
}
