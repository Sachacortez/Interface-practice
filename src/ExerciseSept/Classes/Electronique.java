package ExerciseSept.Classes;

import ExerciseSept.Interfaces.Produit;

public class Electronique implements Produit {
    private double prix;
    private int stock;

    public Electronique(double _prix, int _stock) {
        prix = _prix;
        stock = _stock;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public int getStock() {
        return stock;
    }
    
}
