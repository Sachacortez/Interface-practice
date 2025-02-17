package ExerciseSept.Classes;

import java.time.LocalDate;

import ExerciseSept.Interfaces.Produit;


public class Inventaire {

    public void gererProduit(Produit produit) {
        System.out.println("Ce produit coût " + produit.getPrix() + 
        " et il reste " + produit.getStock() + " en stock");
        if(produit instanceof Nourriture nourriture) {
            if(nourriture.getDateDExpiration().isAfter(LocalDate.now())) {
                nourriture.conserverEnCave();
            } else {
                nourriture.retirerDeCave();
            }
        }
    } 
}
