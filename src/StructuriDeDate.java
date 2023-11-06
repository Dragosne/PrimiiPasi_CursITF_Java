public class StructuriDeDate {
    public static void main(String[] args) {
    //array
        //declarare si initializare
        String[] elevi = {"Gigel","Costel","Mari","Ela","Ada","Gabi", "Vasile"};
        int[] numere = {1,33,81,99,201};
        //are o dimensiune fixa
        System.out.println(elevi[2]);
        elevi[2] = "Sebi";//suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);
        System.out.println(elevi[5]);
        System.out.println(elevi[2] + " "+ elevi[3]);
        System.out.println(elevi.length + 5);
        //sa printam tot timpul ultimul elev
        System.out.println("Last Place: "+ elevi[elevi.length - 1]);

        //declarare si alocare de memorie fara initializare

        int[] note = new int[5];
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
    }//inchidemain
}//inchide