package tugas;

// Nama : Muhammad Farras Ananta
// NPM  : 2310010544

public class MainTugas {

    public static void main(String[] args) {

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001001", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "231001002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "231001003", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Doni", "231001004", 70));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "231001005", 50));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        // Menambahkan mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "231001006", 85));

        System.out.println();
        System.out.println("Setelah menambah mahasiswa baru");
        System.out.println("Jumlah data mahasiswa : "
                + kelas.jumlahMahasiswa());

        System.out.println();
        kelas.tampilkanSemua();
    }
}