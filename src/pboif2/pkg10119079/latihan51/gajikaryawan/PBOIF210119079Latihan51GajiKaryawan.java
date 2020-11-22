package pboif2.pkg10119079.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan51GajiKaryawan {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner input = new Scanner(System.in);
        
                //input
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukkan NIK      : ");
        manager.setNik(input.nextLine());
        System.out.print("Masukkan Nama     : ");
        manager.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(input.nextInt());
        
        //output
        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("NIK      : " + manager.getNik());
        System.out.println("NAMA     : " + manager.getNama());
        System.out.println("GOLONGAN : " + manager.getGolongan());
        System.out.println("JABATAN  : " + manager.getJabatan());
        
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN  : " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("GAJI TOTAL : " + manager.gajiTotal());
    }
    
}
