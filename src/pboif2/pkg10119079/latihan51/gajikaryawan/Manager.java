package pboif2.pkg10119079.latihan51.gajikaryawan;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;
    
     public int getKehadiran(){
        return kehadiran;
    }
    
    public void setKehadiran(int kehadiran){
        this.kehadiran=kehadiran;
    }
    
    public float tunjanganKehadiran(int kehadiran){
        tunjanganKehadiran = kehadiran*10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabaran){
        if(jabatan.equals("Manager")){
            tunjanganJabatan = 2000000;
        }else if(jabatan.equals("Kabag")){
            tunjanganJabatan =1000000;
        }else{
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        switch (golongan){
            case 1 :
                tunjanganGolongan = 500000;
                break;
            case 2 :
                tunjanganGolongan = 1000000;
                break;
            case 3 :
                tunjanganGolongan = 1500000;
                break;
            default :
                tunjanganGolongan = 0;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
