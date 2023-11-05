package makhlukhidup;

public class MakhlukHidup {
    
    private String nama;
    private String kelompok;
    private String alatPernafasan;
    private String jumlahKaki;
    private String Makanan;
    protected int usia;
    
    public MakhlukHidup (int usia){
        this.usia = usia;
    } 
    
    public MakhlukHidup() {
    }

    
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the kelompok
     */
    public String getKelompok() {
        return kelompok;
    }

    /**
     * @param kelompok the kelompok to set
     */
    public void setKelompok(String kelompok) {
        this.kelompok = kelompok;
    }

    /**
     * @return the alatPernafasan
     */
    public String getAlatPernafasan() {
        return alatPernafasan;
    }

    /**
     * @param alatPernafasan the alatPernafasan to set
     */
    public void setAlatPernafasan(String alatPernafasan) {
        this.alatPernafasan = alatPernafasan;
    }

    /**
     * @return the jumlahKaki
     */
    public String getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    public void setJumlahKaki(String jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the Makanan
     */
    public String getMakanan() {
        return Makanan;
    }

    /**
     * @param Makanan the Makanan to set
     */
    public void setMakanan(String Makanan) {
        this.Makanan = Makanan;
    }

}  