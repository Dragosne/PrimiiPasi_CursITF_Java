import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        //o lista este ordonata, indexul este de la 0 la n
        //declaram o lista goala
        List<String> fructe = new ArrayList<>();
        //au o dimensiune dinamica
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");
        System.out.println("care este primul fruct: " + fructe.get(0));
        System.out.println("al catelea fruct este banana: " + (fructe.indexOf("banana") + 1));
        System.out.println("este cosul de fructe gol? " + fructe.isEmpty());//este lista goala?
        //eliminam toate
        //fructe.clear();
        //scoatem un element
        //fructe.remove("mar");
        //listam elementele
        fructe.add("prune");
        System.out.println("Ce sfructe sunt in cos?: " + Arrays.toString(fructe.toArray()));

        if (!fructe.isEmpty()){
            System.out.println("Sunt fructe in cos, atunci:");
            System.out.println("avem ce manca");
        } else {
            System.out.println("Nu sunt fructe in cos, atunci:");
            System.out.println("nu avem ce manca");
        //cate fructe sunt in cos
        }
        System.out.println("cate tipuri de fructe sunt in cos? : " + fructe.size());
        //declaram o lista imutabila (nu mai putem adauga valori) si o initializam cu valori
        //string
            List<String> list = Arrays.asList(new String[]{"foo", "bar"});
        //integer
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println("Ce numere sunt in vector?: " + Arrays.toString(numere.toArray()));
        //daca dorin sa declaram o lista dinamica

        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(Arrays.toString(flowerList.toArray()));
        //aflam unde este Poppy
        int poppy_index = flowerList.indexOf("Poppy");
        //stergem ce este in acea pozitie din lista - la poppy
        flowerList.remove(poppy_index);
        System.out.println(Arrays.toString(flowerList.toArray()));
        //stergem o valoare din lista
        flowerList.remove("Catmint");
        System.out.println(Arrays.toString(flowerList.toArray()));
        System.out.println(flowerList);
    }
}
