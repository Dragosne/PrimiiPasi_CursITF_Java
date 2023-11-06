import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        //luam date de la tastatura
    Scanner sc = new Scanner(System.in);
        System.out.println("introdu ora: ");
    int ora = sc.nextInt();
    if(ora < 0){
        System.out.println("ora negativa");
    }
    else if (ora <= 11){
        System.out.println("buna dimineata");
    }
    else if (ora <= 18){
        System.out.println("buna ziua");
    }
    else if (ora <= 21){
        System.out.println("buna seara");
    }
    else if (ora <= 24){
        System.out.println("noapte buna");
    }
    else {
        System.out.println("ora invalida");
    }

    }//inchide functia main
}//inchide clasa
