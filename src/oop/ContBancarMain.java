package oop;

public class ContBancarMain {
    //nu dam psvm
    // acesta este sa spunem program files = definim logica unui cont bancar
    // ce este OOP - object oriented program
    // POO - programare orientata pe obiecte

    // o clasa = este un tip nou
    // este definitia unui concept
    // o clasa este reteta la paste carbonara sau ADN-ul uman
    // daca am reteta am pastele? nu
    // de ex: clasa Car

    // un obiect = implementarea unei clase
    // un obiect pot fi pastele carbonara sau un om
    // facem oricate paste vrem noi cu aceeasi reteta
    // de ex: 1 sau 10 obiect(e) de tip car:

    // fields = proprietati = atribute
    // astea sunt variabile
    // de ex: masina poate avea: culoare, marca, model, consum, pret, esteOprita

    // metode = actiuni ce pot fi de obiecte
    // aceastea pot fi functiile
    // o masina va putea sa faca niste actiuni: accelereaza(), franeaza(), deschideUsa()

    // ce are un cont bancar in materie de atribute? titular/iban/sold
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;
    // constructor == are rolul de a impune date de start
    // ca si * stelutele din formulare, required field
    public ContBancarMain(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
        //toate variabilele care traiesc o functie, traiesc doar de unde incepe acolada si pana se termina
        //metode == actiunile clasei
        // inheritance
        // polimorphism
        // encapsulation
        // abstractisation
    }



    public void activareCont(int pinUtilizator) {
        //modifica activ in true doar daca pinul este corect
        System.out.println("Buna" + this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("Cont activat cu success!");
            this.activ = true;
        } else {
            System.out.println("PIN introdus gresit");
            this.incercari_activare++; //incrementeaza
        }
    }
    public void descriere() {
        System.out.println("Titular de cont este: " + this.titularCont.toUpperCase() + " si are IBAN nr: " + this.iban);
        System.out.println("Are soldul: " + this.sold);
        System.out.println("Contul a fost activat? :" + this.activ);
        System.out.println("Numar de incercari gresite: " + this.incercari_activare);
        System.out.println("______________________________________________________________________");
    }
    public void alimentareCont(double suma_depusa) {
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna" + this.titularCont);
        System.out.println("Ati depus cu succes suma de" + suma_depusa + "Aveti in cont suma de: " + this.sold);

    }
    public void plataCont(double suma_cheltuita) {
        System.out.println("Buna" + this.titularCont);
        if (suma_cheltuita <= this.sold) {
            this.sold = this.sold - suma_cheltuita;
            System.out.println("AI cheltuit: " + suma_cheltuita + "Mai aveti in cont" + this.sold);
        } else {
            System.out.println("Fonduri insuficiente");

        }
    }
}
