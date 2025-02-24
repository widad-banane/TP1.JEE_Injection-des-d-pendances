package presentation;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection de dependances par instanciation statique
         */
        DaoImplV2 d =new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);//Injection via le constructeur
        //metier.setDao(d); //Injection via la setter

        System.out.println("RES="+metier.calcul());
    }
}
