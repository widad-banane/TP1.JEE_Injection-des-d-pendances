package presentation;

import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        System.out.println(metier.calcul());
    }
}
