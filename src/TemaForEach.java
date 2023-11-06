import java.util.Arrays;
import java.util.List;

public class TemaForEach {
    public static void main(String[] args) {
        int s = 0; // declar si initializez variabila intreaga s, pentru conditia =3
        int c = 0; // declar si initializez idem pt =4
        int a = 0; // idem != 3 si 4
        int[] numere = {33, 43, 33, 3, 7, 5 ,89, 90, 32, 34, 37 , 24};
        for (int numar : numere) {
            if (numar == 3) {
                s = s + 1;
            }
            if (numar == 4){
                c = c + 1;
            }
            if (numar != 3 && numar != 4){
                a = a + 1;
            }
        }
        System.out.println("Sirul contine: " + numere.length + " numere");
        System.out.println("Numerele din vector sunt: " + Arrays.toString(Arrays.stream(numere).toArray()));
        System.out.println(" ");
        System.out.println("Cautam valorile 3 si 4 in sir!".toUpperCase());
        System.out.println(" ");
            if (s > 0) {
                System.out.println("Cifra 3 apare de: " + s + " ori");
            } else {
                System.out.println("Cifra 3 nu exista in sir");
            }
            if (c > 0){
                System.out.println("Cifra 4 apare de: " + c + " ori");
            } else {
            System.out.println("Cifra 4 nu exista in sir");
            }
            System.out.println("In afara cifrelor 3 si 4 mai sunt " + a + " valori in sir");
    }
}
