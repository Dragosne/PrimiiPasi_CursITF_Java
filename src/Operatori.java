public class Operatori {
    public static void main(String[] args) {
        //operatori
        /*
        sunt de mai multe feluri
        1. Aritmetici: + , - , * , / , modulo = % - aflarea restului impartirii
        2. De comparare: > < == diferit != >= <=
        3. Logici: AND = &&, OR = ||, NOT = !
         */
        //FLOW CONTROL -
        /*
        IF ELSE
         */
   int a = 3;
   //o declarare && initializare
   int b = 5;
   a = b;
   //suprascriere
        System.out.println(a);
        System.out.println("a + b = " + (a+b));
        System.out.println("a x b = " + (a*b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a : b = " + (a/b));
        System.out.println(a >= b);
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(7>b && 8>b);
        System.out.println(7>b || 8>b);
        System.out.println(7>b && (8>b || 3>b));
        System.out.println(!(7>b));
//IF ELSE

    }
}
