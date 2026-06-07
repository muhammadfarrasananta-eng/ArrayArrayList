package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan4 {
    public static void main(String[] args) {

        ArrayList<String> buah = new ArrayList<>();

        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");

        buah.add(1,"Pisang");

        buah.set(0,"Anggur");

        buah.remove("Jeruk");

        System.out.println(buah);
        System.out.println("Jumlah : " + buah.size());
    }
}