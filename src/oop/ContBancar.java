package oop;

public class ContBancar {
    public static void main(String[] args) {
        //initializam obiecte de timp ContBancar
        //instante ale clasei ContBancar
        ContBancarMain cont1 = new ContBancarMain("Dragos Nechifor", "RO01 0000 0000 9999 7584");
        ContBancarMain cont2 = new ContBancarMain("Laura Nechifor", "RO02 0000 0000 9999 0001");

        cont1.activareCont(7777);
        cont2.activareCont(8888);
        cont2.activareCont(8888);
        cont2.activareCont(8888);
        cont2.activareCont(7777);

        //alimentam contul

        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        // negative testing

        cont1.plataCont(500);

        //positive cu suma exacta
        cont1.plataCont(300.50);

        // positive de 2 x

        cont2.plataCont(100);
        cont2.plataCont(200);


        cont1.descriere();
        cont2.descriere();
    }
}
