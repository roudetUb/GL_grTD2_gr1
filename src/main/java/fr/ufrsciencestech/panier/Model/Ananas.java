/**
 *
 * @author roudet
 */
package fr.ufrsciencestech.panier.Model;


public class Ananas extends FruitSimple implements Fruit{
    private double prix;
    private String origine;

    public Ananas()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Cameroun";
    }

    public Ananas(double prix, String origine)
    {
    	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Finlande";  //Finlande par défaut
	else
            this.origine = origine;   
    }

 

    @Override
    public String toString(){
        return "Ananas de " + origine + " coutant " + prix + " euros";
    }



    public boolean isSeedless() {  //predicat indiquant qu'un Ananas n'a pas de pepins
        return true;
    }


}
