package fr.ufrsciencestech.panier.Model;

/**
 *
 * @author roudet
 */
public class Orange extends FruitSimple implements Fruit {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }


    @Override
    public String toString(){
        return "Orange de " + origine + " coutant " + prix + " euros";
    }

   
    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    /*public static void main (String[] args){
        //Ecrire ici vos tests
	//System.out.println("premier test Orange");
   }*/
}
