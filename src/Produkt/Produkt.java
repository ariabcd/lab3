package Produkt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Produkt {
    private int basispreis;
    private int anzahlvontage;

    public int getBasispreis() {
        return basispreis;
    }

    public int getAnzahlvontage() {
        return anzahlvontage;
    }

    public void setBasispreis(int basispreis) {
        this.basispreis = basispreis;
    }

    public void setAnzahlvontage(int anzahlvontage) {
        this.anzahlvontage = anzahlvontage;
    }

    public Produkt(int basispreis, int anzahlvontage) {
        this.basispreis = basispreis;
        this.anzahlvontage = anzahlvontage;
    }


    public List<Produkt> Rabatt(List<Produkt> produkte){
        for(Produkt prod:produkte){
            if(prod.anzahlvontage > 10){
                prod.basispreis = prod.basispreis - prod.basispreis * 10 / 100;
            }
            if (prod.anzahlvontage > 20){
                prod.basispreis = prod.basispreis - prod.basispreis * 20 / 100;
            }
        }
        return produkte;
    }
    public List<Produkt> Merhals100(List<Produkt> produkte){
        List<Produkt> finallist = new ArrayList<>();
        for(Produkt prod:produkte){
            if(prod.basispreis > 100){
                finallist.add(prod);
            }
        }
        return finallist;
    }
    public List<Produkt> sortnachrabatt(List<Produkt> produkte){
        produkte = this.Rabatt(produkte);
        produkte.sort(Comparator.comparing(Produkt::getBasispreis));
        return produkte;
    }
    public Produkt teuersteprod(List<Produkt> produkte){
        produkte.sort(Comparator.comparing(Produkt::getBasispreis));
        return produkte.get(produkte.size()-1);
    }
    public Produkt gunstigsterprod(List<Produkt> produkte){
        produkte.sort(Comparator.comparing(Produkt::getBasispreis));
        return produkte.get(0);
    }
    @Override
    public String toString() {
        return "Produkt{" +
                "basispreis=" + basispreis +
                ", anzahlvontage=" + anzahlvontage +
                '}';
    }
}
