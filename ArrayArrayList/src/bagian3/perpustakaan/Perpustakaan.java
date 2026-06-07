package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku){
        koleksi.add(buku);
    }

    public void tampilkanKoleksi(){

        System.out.println("== Koleksi Perpustakaan ==");

        for(int i=0;i<koleksi.size();i++){
            System.out.println((i+1)+". "+koleksi.get(i).info());
        }
    }

    public void pinjamBuku(String judul){

        for(Buku b : koleksi){

            if(b.getJudul().equals(judul)){

                if(b.isDipinjam()){
                    System.out.println(judul + " sedang dipinjam");
                }else{
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam");
                }
                return;
            }
        }
    }

    public int jumlahTersedia(){

        int jumlah = 0;

        for(Buku b : koleksi){
            if(!b.isDipinjam()){
                jumlah++;
            }
        }

        return jumlah;
    }
}