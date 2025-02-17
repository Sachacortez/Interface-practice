package ExerciseSept.Classes;

import java.time.LocalDate;

import ExerciseSept.Interfaces.Produit;
import ExerciseSept.Interfaces.Stockable;

public class Nourriture implements Produit, Stockable {
    private double prix;
    private int stock;
    private LocalDate dateDExpiration;

    public LocalDate getDateDExpiration() {
        return dateDExpiration;
    }

    public Nourriture(double _prix, int _stock, LocalDate _dateDExpiration) {
        prix = _prix;
        stock = _stock;
        dateDExpiration = _dateDExpiration;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void conserverEnCave() {
        System.out.println("La nourriture est cool");
        stock++;
    }

    @Override
    public void retirerDeCave() {
            System.out.println("La nourriture est périmée");
            stock--;
    }
    
}
