public class Variabile {
    public static void main(String[] args) {
        //declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 90";
        //strongly typed - trabuie sa specificam tipul de date cu care lucram
        System.out.println("Am cumparat o masina: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //suprascrierea
        modelMasina = "XC 90 FACELIFT";
        System.out.println("Am cumparat o masina: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //declarare
        String nume;
        String prenume;

        //initializare
        nume = "Georgel";
        prenume = "Pasarel";
        int varsta = 34;

        //concatenare de variabile string
        System.out.println(prenume + " " + nume + "si are varsta: " + varsta);
    }
}
