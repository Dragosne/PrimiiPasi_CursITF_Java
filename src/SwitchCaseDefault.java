import java.util.Scanner;

public class SwitchCaseDefault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("IntroducetiOptiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("revino in meniul anterior");
                break;
            case 1:
                System.out.println("ati selectat lb romana");
                break;
            case 2:
                System.out.println("ati selectat lb engleza");
                break;
            default:
                System.out.println("Introduceti o optiune valida");
        }
    }// inchide main
}//inchide clasa
