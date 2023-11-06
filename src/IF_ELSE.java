public class IF_ELSE {
    public static void main(String[] args) {
//Flow Control - if else
//evalueaza conditii si bifurca codul in functie de rezultat
// pornim radioul - oprim radioul daca piesa e frumoasa dau mai tare
        System.out.println("pornim radioul");
        boolean piesa_faina = true;
        if (piesa_faina == true) {
            System.out.println("dau mai tare");
            System.out.println("incep sa cant si eu piesa");
        }
        System.out.println("oprim radioul");

        int nr = -7;
        if (nr % 2 == 0) {
            System.out.println("numarul este par");
        } else {
            System.out.println("numarul este impar");
        }
        if (nr > 0) {
            System.out.println("numarul este pozitiv");
        } else {
            System.out.println("numarul este negativ");
        }
    }
}
