package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan3 {
    public static void main(String[] args) {

        ArrayList<String> mahasiswa = new ArrayList<>();

        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        System.out.println(mahasiswa);
        System.out.println(mahasiswa.size());
        System.out.println(mahasiswa.get(1));
    }
}