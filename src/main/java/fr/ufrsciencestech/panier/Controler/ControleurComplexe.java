/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Controler;


import fr.ufrsciencestech.panier.Model.Fruit;
import fr.ufrsciencestech.panier.Model.Orange;
import fr.ufrsciencestech.panier.Model.PanierPleinException;
import fr.ufrsciencestech.panier.Model.PanierVideException;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author celine
 */
public class ControleurComplexe extends Controleur{
    
    private String fruitActuelle;
    
    public ControleurComplexe(){
        this.fruitActuelle = "Orange";
    }
    
    @Override
    public void actionPerformed(ActionEvent e){       
        if(((Component)e.getSource()).getName().equals("Plus"))
            try {
              
                p.ajoute();
        } catch (PanierPleinException ex) {
            //JOptionPane.showMessageDialog(null, "Panier plein", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        else if(((Component)e.getSource()).getName().equals("ListeFruits")){
            JComboBox cb = (JComboBox)e.getSource();
            this.fruitActuelle = (String)cb.getSelectedItem();
            System.out.println(this.fruitActuelle);
        }
        else
            try {
                p.retire();
        } catch (PanierVideException ex) {
            //JOptionPane.showMessageDialog(null, "Panier vide", "Erreur", JOptionPane.ERROR_MESSAGE) ;
        }
            
    }
}
