package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi","Andrea Hirata"));
        perpus.tambahBuku(new Buku("Bumi Manusia","Pramoedya"));
        perpus.tambahBuku(new Buku("Negeri 5 Menara","Ahmad Fuadi"));

        perpus.tampilkanKoleksi();

        perpus.pinjamBuku("Bumi Manusia");

        System.out.println("Buku tersedia : " +
                perpus.jumlahTersedia());
    }
}