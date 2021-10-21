/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Model;

/**
 *
 * @author cb778525
 */
public class cerise implements Fruit  {

    private double prix;
    private String origine;
    
    public cerise(){
        this.prix = 1.0;
        this.origine = "Cerise de france";
    }
    
    @Override
    public boolean isSeedless() {
        return false;
    }

    @Override
    public double getPrix() {
        return this.prix;
    }

    @Override
    public String getOrigine() {
        return this.getOrigine();
    }
    
    
}
