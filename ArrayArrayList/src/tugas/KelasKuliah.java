package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("=== DAFTAR MAHASISWA ===");

        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "LULUS" : "TIDAK LULUS";

            System.out.println(
                    m.getNama() + " | " +
                    m.getNpm() + " | Nilai: " +
                    m.getNilai() + " | " +
                    status
            );
        }
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}