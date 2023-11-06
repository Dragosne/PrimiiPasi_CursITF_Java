import java.sql.SQLOutput;

public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // camel case sau snake case - nu putem folosii spatii in nume
    // nu putem defini o functie in alta functie (nu putem instala firefox in chrome)
    // puteti vedea o functie ca pe o mica aplicatie

    // o functie simpla care ne printeaza ceva pe ecran


    public static void printGreeting(){
        System.out.println("Buna ziua! Bine ati venit");
    }
    // public == putem accesa din orice clasa
    // static pt ca nu lucram inca in contextul de programare bazata pe obiect
    // void == nu ne da nici un raspuns/nu ne returneaza nimic

    // o functie care saluta clientul in functie de numele lui
    // nu ne da nici un raspuns (n u are return)
    // nu are parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
        }
    // o functie care calculeaza suma a 3 numere
    // ne da un raspuns (are return == suma numerelor)
    // are nevoie de parametri
    public static int sumaNr(int a, int b, int c){
        int sumaNr = a + b + c;
        return sumaNr;
    }
    public static double mediaNr(double a, double b, double c){
        double mediaNr = (a + b + c) / 3;
        return mediaNr;
    }
    // o functie care ne da valoarea lu pi
    // ne da un raspuns? da
    // are nevoie de parametri?  nu
    // raspunsul va fi double
    public static double piValue() {
        final double PI = 3.14;
        return PI;
        // constanta - valoare care nu poate fi suprascrisa
    }

    public static void main(String[] args) {
    // functia main/
        //intra clientul 1 in hotel
        printGreeting();

        //intraclientul numarul
        printGreeting(); //cmd+click pe functie => ne duce la corpul ei
        //apelam o functie cu parametri oferind argumente
        printGreetingByName("NECHIFOR", "Dragos");
        printGreetingByName("NECHIFOR", "Laura");
        System.out.println(mediaNr(3, 5, 5));
        System.out.println(sumaNr(4, 4, 5));
        double media1 = mediaNr(31213, 312313, 423);
        double media2 = mediaNr(35, 324, 41);
        double media3 = mediaNr(33, 11, 11);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);
        System.out.println(piValue());
        System.out.println("aria cercului este: " + piValue() * 3 * 3);
    }
}
