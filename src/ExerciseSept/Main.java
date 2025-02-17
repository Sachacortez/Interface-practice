package ExerciseSept;

import java.time.LocalDate;

import ExerciseSept.Classes.Electronique;
import ExerciseSept.Classes.Inventaire;
import ExerciseSept.Classes.Nourriture;
import ExerciseSept.Classes.Vetements;
import ExerciseSept.Interfaces.Produit;

public class Main {
    public static void main(String[] args) {
        
        Produit nourriture = new Nourriture(10.00, 10, LocalDate.of(2025,12,31));
        Produit electronique = new Electronique(100.00, 5);
        Produit vetements = new Vetements(20.00, 15);
        Inventaire i = new Inventaire();

        i.gererProduit(vetements);
        i.gererProduit(nourriture);
        i.gererProduit(electronique);

    }
}
