public class FOR_repetitive {
    public static void main(String[] args) {
//        for - loop, structura repetitiva
//        de unde incepem?
//        pana unde mergem?
//        pasul de parcurgere
//        problema: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++) { //i++ = i=i+1
        System.out.println("Dalmatianul cu nr " + i);
    }
        int[] numere = {3, 7, 10, 20};
        for (int i = 0; i < numere.length; i++) {
            System.out.println("elementul are index: " + i + " si valoarea: " + numere[i]);
        }
//        for each - parcurge tote elementele din array si ajunge direct la valoare
        for (int numar : numere) {
            System.out.println("numarul este: " + numar);
        }
//        parcurgem un array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for(String culoare : culori){
            System.out.println("culoare actuala este: " + culoare);
        }
//        problema: suma numerelor din array
        int s = 0;
        for (int numar : numere) {
            s = s + numar;
        }
        System.out.println(s);
    }
}
