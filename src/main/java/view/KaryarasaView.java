package view;

import model.ProgramSosial;
import java.util.ArrayList;


public class KaryarasaView {

    public void tampilkanMenu() {
        System.out.println("===================================================");
        System.out.println("|    SISTEM MANAJEMEN SOCIAL PROJECT 'KARYARASA'  |");
        System.out.println("===================================================");
        System.out.println("| 1. Tambah Program Sosial & Pengaju              |");
        System.out.println("| 2. Tampilkan Daftar Program Sosial              |");
        System.out.println("| 3. Hapus Program Sosial                         |");
        System.out.println("| 4. Update Anggaran Program                      |");
        System.out.println("| 5. Keluar                                       |");
        System.out.println("===================================================");
        System.out.print("Pilih menu (1-5) : ");
    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }

    public void tampilkanDaftarProgram(ArrayList<ProgramSosial> daftarProgram) {
        if (daftarProgram.isEmpty()) {
            System.out.println("\n>> Belum ada data program sosial di Karyarasa.");
            return;
        }

        System.out.println("\n==================================================================");
        System.out.println("                DAFTAR PROGRAM SOSIAL KARYARASA                    ");
        System.out.println("==================================================================");
        for (int i = 0; i < daftarProgram.size(); i++) {
            System.out.print("[" + (i + 1) + "] ");
            
            daftarProgram.get(i).tampilkanInfo();
        }
    }
}