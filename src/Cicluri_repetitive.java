public class Cicluri_repetitive {
    public static void main(String[] args) {
//    SET => lista de elemente in care fiecare element apare o singura data
//    Coada (Queue) => (FIFO) pers 1, pers 2, pers 3
//    valorile se introduc in ordine primul venit primul iesit
//    Stiva => LIFO last in first out, valorile se stocheaza de la coada la cap
//    WHILE - loop/ciclu repetitiv o zona de cod care se repeta atat timp cat o conditie e true
//    Problema: Masina merge cat timp are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {
            //acceleram
            System.out.println("acceleram");
            //scadem benzina
            litri_benzina = litri_benzina-1;
            System.out.println("mai avem: " + litri_benzina + " litri de benzina");
            //aprindem beculetul cand mai avem <= 3 litri
            if (litri_benzina <= 3) {
                System.out.println("se aprinde becul rosu");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
