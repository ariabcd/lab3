import Produkt.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produkt> list = new ArrayList<>();
        Produkt p1 = new Produkt(10,2);
        Produkt p2 = new Produkt(100,11);
        Produkt p3 = new Produkt(200,21);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(p2.Rabatt(list));
        System.out.println(p2.gunstigsterprod(list));
    }
}