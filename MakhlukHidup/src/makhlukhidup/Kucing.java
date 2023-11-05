package makhlukhidup;

public class Kucing {
    
public static void main(String[] args) {
       
        HewanDarat kucing = new HewanDarat();
        
        kucing.setNama("Kucing");
        kucing.setKelompok("Mamalia");
        kucing.setAlatPernafasan("Paru-paru");
        kucing.setJumlahKaki("4");
        kucing.setMakanan("Daging");
        
        System.out.println("Nama Hewan: " + kucing.getNama());
        System.out.println("Jenis Hewan: " + kucing.getKelompok());
        System.out.println("Bernafas Dengan: " + kucing.getAlatPernafasan());
        System.out.println("Jumlah kaki kucing: " + kucing.getJumlahKaki());
        System.out.println("Makanan kesukaan kucing: " + kucing.getMakanan());
            
                
    }
    
}