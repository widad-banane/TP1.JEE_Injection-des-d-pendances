package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection de dependances par instanciation statique
         */
        DaoImpl d=new DaoImpl();
        MetierImpl metier = new MetierImpl(d);//Injection via le constructeur
        //metier.setDao(d); //Injection via la setter

        System.out.println("RES="+metier.calcul());
    }
}
