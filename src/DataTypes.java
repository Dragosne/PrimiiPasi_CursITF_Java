import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.sql.SQLOutput;
import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
    //cele mai folosite 5 tipuri de date
    //String = sir de caractere delimitate " "
        String marca = "Dacia";
        String model = "1310";
        System.out.println(marca.toUpperCase());
        System.out.println(marca.concat("rabla"));
        System.out.println(marca.length());
        int a = 3;
        int b = 4;
        int an_fabricatie = 1987;
        System.out.println(a + b);

    //double = numar zecimal
        double pret = 2300.50;

    //boolean = adevarat sau fals
        boolean inmatriculata = true;
        // char = un singur caracter
        char nota = 'A';
    }

}
